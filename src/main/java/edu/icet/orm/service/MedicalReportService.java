package edu.icet.orm.service;

import edu.icet.orm.dto.MedicalReport;
import edu.icet.orm.entity.MedicalReportEntity;

import java.io.IOException;
import java.util.ArrayList;

public interface MedicalReportService {
    void uploadReport(MedicalReport medicalReport) throws IOException;
    ArrayList<MedicalReportEntity> getReportsByPatientId(Integer patientId);
}
