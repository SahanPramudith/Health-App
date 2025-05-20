package edu.icet.orm.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Prescription {
    private Integer id;
    private LocalDate date;
    private String medicines;
    private String instructions;
    private Integer patientId;
}
