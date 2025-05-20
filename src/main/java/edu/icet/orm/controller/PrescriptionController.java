package edu.icet.orm.controller;

import edu.icet.orm.dto.Prescription;
import edu.icet.orm.service.PrescriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Prescription")
@RequiredArgsConstructor
public class PrescriptionController {

    private final PrescriptionService service;

    @PostMapping("/save-prescription")
    public void Prescription(@RequestBody Prescription prescription){
        service.save(prescription);
    }

    @GetMapping("/get-prescriptions")
    public ArrayList<Prescription> getPrescriptions(){
        return service.getPrescriptions();
    }
}
