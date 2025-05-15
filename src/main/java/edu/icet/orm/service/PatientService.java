package edu.icet.orm.service;

import edu.icet.orm.dto.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


public interface PatientService {
    ArrayList<Patient> getPatient();

    void addPatient(Patient patient);
}
