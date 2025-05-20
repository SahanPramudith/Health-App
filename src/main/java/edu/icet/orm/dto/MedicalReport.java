package edu.icet.orm.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class MedicalReport {
    private Long id ;
    private String category;
    private MultipartFile file;
    private Integer patientId;
    private Integer adminId;
}
