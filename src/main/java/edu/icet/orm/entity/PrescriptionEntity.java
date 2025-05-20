package edu.icet.orm.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "prescriptions")
@Data
public class PrescriptionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate date;
    private String medicines;
    private String instructions;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientEntity patientId;
}
