package com.Caregiver.dao;

import com.Caregiver.model.Patient;

import java.util.List;

/**
 * The PatientI interface declares abstract methods and
 * is implemented by other classes to provide services for a patient.
 */
public interface PatientI {

    void createPatient(Patient patient);
    Patient getPatientById(int patientId);
    void updatePatient(Patient patient);
    void deletePatient(int patientId);
    List<Patient> getAllPatient();
}
