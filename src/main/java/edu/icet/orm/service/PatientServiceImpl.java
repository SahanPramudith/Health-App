package edu.icet.orm.service;

import edu.icet.orm.dto.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PatientServiceImpl implements PatientService{

    ArrayList <Patient>patientList = new ArrayList<>();
    @Override
    public ArrayList<Patient> getPatient() {
        return patientList;
    }

    @Override
    public void addPatient(Patient patient) {

        patientList.add(patient);
    }
}
