package edu.icet.orm.service;

import edu.icet.orm.dto.Prescription;

import java.util.ArrayList;

public interface PrescriptionService {
    void save(Prescription prescription);

    ArrayList<Prescription> getPrescriptions();
}
