package edu.icet.orm.service.IMPL;

import edu.icet.orm.dto.Prescription;
import edu.icet.orm.entity.PrescriptionEntity;
import edu.icet.orm.repository.PatientRepository;
import edu.icet.orm.repository.PrescriptionRepository;
import edu.icet.orm.service.PrescriptionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class PrescriptionImpl implements PrescriptionService {

    private final PrescriptionRepository repository;
    private final PatientRepository patientRepo;
    private final ModelMapper mapper;

    @Override
    public void save(Prescription prescription) {
        PrescriptionEntity prescriptionEntity = new PrescriptionEntity();
        prescriptionEntity.setDate(LocalDate.now());
        prescriptionEntity.setMedicines(prescription.getMedicines());
        prescriptionEntity.setInstructions(prescription.getInstructions());
        prescriptionEntity.setPatientId(patientRepo.findById(prescription.getPatientId()).orElse(null));

        repository.save(prescriptionEntity);

    }

    @Override
    public ArrayList<Prescription> getPrescriptions() {
        ArrayList<Prescription> presList = new ArrayList<>();
        repository.findAll().forEach(prescriptionEntity -> {
            presList.add(mapper.map(prescriptionEntity, Prescription.class));
        });

        return presList;
    }
}
