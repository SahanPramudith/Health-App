package edu.icet.orm.service;

import edu.icet.orm.dto.Patient;

import java.util.ArrayList;


public interface PatientService {
    

    ArrayList<Patient> getPatient();

    void addPatient(Patient patient);

    void detePatient(Integer id);

    ArrayList<Patient> searchByName(String name);

    ArrayList<Patient> searchByNic(String nic);
}
