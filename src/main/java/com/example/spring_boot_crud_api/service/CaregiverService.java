package com.example.spring_boot_crud_api.service;

import com.example.spring_boot_crud_api.model.Caregiver;
import com.example.spring_boot_crud_api.repository.CaregiverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CaregiverService {

    @Autowired
    private CaregiverRepository caregiverRepository;

    public List<Caregiver> getAllCaregivers(){
        return caregiverRepository.findAll();
    }

    public Optional<Caregiver> getCaregiverById(Integer id){
        return caregiverRepository.findById(id);
    }

    public Caregiver saveCaregiver(Caregiver caregiver){
        return caregiverRepository.save(caregiver);
    }

    public void deleteCaregiver(Integer id){
        caregiverRepository.deleteById(id);
    }
}
