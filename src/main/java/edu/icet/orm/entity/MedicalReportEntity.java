package edu.icet.orm.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "medical_report")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalReportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String category;
    private String fileName;
    private String filePath;
    private LocalDateTime createdAt;
    @ManyToOne
    @JoinColumn(name = "patient_id",referencedColumnName = "id")
    private PatientEntity patient;
}
