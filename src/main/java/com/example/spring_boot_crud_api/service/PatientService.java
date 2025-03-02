package com.example.spring_boot_crud_api.service;

import com.example.spring_boot_crud_api.model.Patient;
import com.example.spring_boot_crud_api.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    public Optional<Patient> getPatientById(Integer id){
        return patientRepository.findById(id);
    }

    public Patient savePatient(Patient patient){
        return patientRepository.save(patient);
    }

    public void deletePatient(Integer id){
        patientRepository.deleteById(id);
    }

}
