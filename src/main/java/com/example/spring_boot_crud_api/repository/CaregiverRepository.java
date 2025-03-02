package com.example.spring_boot_crud_api.repository;

import com.example.spring_boot_crud_api.model.Caregiver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaregiverRepository extends JpaRepository<Caregiver, Integer> {
}
