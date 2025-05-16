package edu.icet.orm.repository;

import edu.icet.orm.dto.Patient;
import edu.icet.orm.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface PatientRepository extends JpaRepository<PatientEntity, Integer> {

    ArrayList<PatientEntity> findByName(String name);


    ArrayList<PatientEntity> findByNic(String nic);
}
