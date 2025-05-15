package edu.icet.orm.controller;

import edu.icet.orm.dto.Patient;
import edu.icet.orm.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping("/getPatient")
    public ArrayList<Patient> getPatient() {
       return patientService.getPatient();

    }
    @PostMapping("/patient-save")
    public void addPatient(@RequestBody Patient patient) {
        patientService.addPatient(patient);
    }

}
