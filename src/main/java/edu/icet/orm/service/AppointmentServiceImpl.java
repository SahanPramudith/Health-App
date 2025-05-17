package edu.icet.orm.service;

import edu.icet.orm.dto.Appointment;
import edu.icet.orm.entity.AppointmentEntity;
import edu.icet.orm.repository.AppointmentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AppointmentServiceImpl implements AppointmentService{
   @Autowired
    AppointmentRepository repository;
   @Autowired
   ModelMapper
    modelMapper;

    @Override
    public void addAppointment(Appointment appointment) {
        repository.save(modelMapper.map(appointment, AppointmentEntity.class));
    }

    @Override
    public ArrayList<Appointment> getAll() {
        ArrayList<Appointment> appointment = new ArrayList<>();

        for (AppointmentEntity appointmentEntity : repository.findAll()) {
            appointment.add(modelMapper.map(appointmentEntity,Appointment.class));
        }
        return appointment;
    }

}
