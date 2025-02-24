package com.Caregiver.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Caregivers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Caregiver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CaregiverID")
    private int caregiverID;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Speciality")
    private String speciality;

    @ManyToMany(mappedBy = "caregivers", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private Set<Patient> patients = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caregiver caregiver = (Caregiver) o;
        return caregiverID == caregiver.caregiverID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(caregiverID);
    }
}
