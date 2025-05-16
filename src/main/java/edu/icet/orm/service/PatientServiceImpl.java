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

    @Override
    public void detePatient(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public ArrayList<Patient> searchByName(String name) {
        ArrayList<Patient> patients = new ArrayList<>();
       repository.findByName(name).forEach(entity ->{
           patients.add(mapper.map(entity, Patient.class));
       } );

       return patients;
    }

    @Override
    public ArrayList<Patient> searchByNic(String nic) {
        ArrayList<Patient> searchNic = new ArrayList<>();
        repository.findByNic(nic).forEach(entity -> {
            searchNic.add(mapper.map(entity, Patient.class));
        });

        return searchNic;
    }


}
