package com.Caregiver.org.controller;


import com.Caregiver.org.model.Patient;
import com.Caregiver.org.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public String getAllPatients(Model model){
        List<Patient> patients = patientService.getAllPatients();
        model.addAttribute("patients", patients);
        return "patient-list";
    }
}
