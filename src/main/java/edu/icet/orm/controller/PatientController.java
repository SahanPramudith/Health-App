package edu.icet.orm.controller;

import edu.icet.orm.dto.Patient;
import edu.icet.orm.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Integer id){
        patientService.detePatient(id);
    }
    @PutMapping("/update")
    public void updatePatient(@RequestBody Patient patient){
        patientService.addPatient(patient);
    }
    @GetMapping("/search/name/{name}")
    public ArrayList<Patient> searchByName(@PathVariable String name){
        return patientService.searchByName(name);
    }
    @GetMapping("/search/nic/{nic}")
    public ArrayList<Patient> searchByNic(@PathVariable String nic) {
        return patientService.searchByNic(nic);
    }
}
