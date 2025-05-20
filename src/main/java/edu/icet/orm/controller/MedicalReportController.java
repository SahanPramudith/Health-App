package edu.icet.orm.controller;

import edu.icet.orm.dto.MedicalReport;
import edu.icet.orm.entity.MedicalReportEntity;
import edu.icet.orm.service.MedicalReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/medical-reports")
@RequiredArgsConstructor

public class MedicalReportController {

    private final MedicalReportService service;

    @PostMapping("/uploard")
    public ResponseEntity<String>uploard(@ModelAttribute MedicalReport report){
        try {
            service.uploadReport(report);
            return ResponseEntity.ok("Uploaded successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @GetMapping("/patient/{id}")
    public List<MedicalReportEntity> getReports(@PathVariable Integer id) {
        return service.getReportsByPatientId(id);
    }


}
