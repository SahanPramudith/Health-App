package edu.icet.orm.controller;

import edu.icet.orm.dto.Patient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@CrossOrigin
public class PatientController {
    @GetMapping
    public  Patient getPatient(){
        Patient patient = new Patient();
        patient.setId(1);
        patient.setName("sahan");
        patient.setAddress("matara");
        return patient;
    }

}
