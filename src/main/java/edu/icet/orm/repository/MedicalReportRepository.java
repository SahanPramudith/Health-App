package edu.icet.orm.repository;

import edu.icet.orm.entity.MedicalReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface MedicalReportRepository extends JpaRepository<MedicalReportEntity,Long> {
    ArrayList<MedicalReportEntity> findByPatientId(Integer patientId);

}
