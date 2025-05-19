package edu.icet.orm.repository;

import edu.icet.orm.entity.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.*;
import java.util.ArrayList;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity,Integer> {


    ArrayList<AppointmentEntity> findByPatientId(String patientId);
}
