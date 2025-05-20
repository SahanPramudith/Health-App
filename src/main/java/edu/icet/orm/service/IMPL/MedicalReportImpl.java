package edu.icet.orm.service.IMPL;

import edu.icet.orm.dto.MedicalReport;
import edu.icet.orm.entity.MedicalReportEntity;
import edu.icet.orm.entity.PatientEntity;
import edu.icet.orm.repository.MedicalReportRepository;
import edu.icet.orm.repository.PatientRepository;
import edu.icet.orm.service.MedicalReportService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MedicalReportImpl implements MedicalReportService {

    private final MedicalReportRepository repository;
    private final PatientRepository patientRepository;
    private final ModelMapper mapper;

    private final String uploadDir = "uploads/medical_reports/";

    @Override
    public void uploadReport(MedicalReport medicalReport) throws IOException {
        PatientEntity patientEntity=patientRepository.findById(medicalReport.getPatientId()).orElseThrow();
        String fileName= UUID.randomUUID()+"_"+medicalReport.getFile().getOriginalFilename();
        String filePath=uploadDir+fileName;

        MedicalReportEntity report = mapper.map(medicalReport, MedicalReportEntity.class);
        report.setFileName(fileName);
        report.setFilePath(filePath);
        report.setCreatedAt(LocalDateTime.now());
        report.setPatient(patientEntity);

        repository.save(report);

    }

    @Override
    public ArrayList<MedicalReportEntity> getReportsByPatientId(Integer patientId) {
        return repository.findByPatientId(patientId);
    }
}
