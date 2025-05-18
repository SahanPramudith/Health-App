package edu.icet.orm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Appointment {
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
