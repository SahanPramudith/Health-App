package edu.icet.orm.service;

import edu.icet.orm.dto.Appointment;

import java.util.ArrayList;

public interface AppointmentService {
    void addAppointment(Appointment appointment);

    ArrayList<Appointment> getAll();




}
