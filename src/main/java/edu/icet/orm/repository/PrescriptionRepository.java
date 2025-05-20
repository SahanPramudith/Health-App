package edu.icet.orm.repository;

import edu.icet.orm.entity.PrescriptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<PrescriptionEntity,Integer> {

}
