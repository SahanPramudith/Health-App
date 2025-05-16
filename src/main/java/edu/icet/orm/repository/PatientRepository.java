package edu.icet.orm.repository;

import edu.icet.orm.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends JpaRepository<PatientEntity, Integer> {
}
