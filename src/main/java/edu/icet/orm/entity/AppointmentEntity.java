package edu.icet.orm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Setter
@Getter
@ToString
@Table(name = "Appointment_details")
public class AppointmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private String gr;
    private LocalDate date;
    private LocalTime time;
    private String status;
    private String g_Number;
    private String roomNuber;
    private String adminId;
    private String patientId;
}
