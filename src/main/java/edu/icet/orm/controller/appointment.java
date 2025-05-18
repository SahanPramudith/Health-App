package edu.icet.orm.controller;

import edu.icet.orm.dto.Appointment;
import edu.icet.orm.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/appointment")
public class appointment {
    @Autowired
    AppointmentService appointmentService;

    @PostMapping("/addAppointment")
    public void addAppointment(@RequestBody Appointment appointment){
        appointmentService.addAppointment(appointment);
    }
    @GetMapping("/All-Appointment")
    public ArrayList<Appointment> getAppointment(){
        return appointmentService.getAll();
    }

        @GetMapping("search/searchByNic/{patientId}")
    public ArrayList<Appointment> searchByNic(@PathVariable String patientId){
            ArrayList<Appointment> appointments = appointmentService.searchByNic(patientId);
            System.out.println("appointments = " + appointments);
            return appointments;
        }



}
