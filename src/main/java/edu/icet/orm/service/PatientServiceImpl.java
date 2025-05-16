package edu.icet.orm.service;

import edu.icet.orm.dto.Patient;
import edu.icet.orm.entity.PatientEntity;
import edu.icet.orm.repository.PatientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    PatientRepository repository;
    @Autowired
    ModelMapper mapper;


    ArrayList <Patient>patientList = new ArrayList<>();
    @Override
    public ArrayList<Patient> getPatient() {
        ArrayList<Patient> patientList = new ArrayList<>();
        for (PatientEntity patientEntity : repository.findAll()) {
            patientList.add(mapper.map(patientEntity, Patient.class));
        }
        return patientList;
    }

    @Override
    public void addPatient(Patient patient) {
        repository.save(mapper.map(patient, PatientEntity.class));


    }
}
