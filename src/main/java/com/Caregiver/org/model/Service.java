//package com.Caregiver.org.model;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.util.Date;
//import java.util.Objects;
//
//@Entity
//@Data
//public class Service {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "serviceID")
//    private Integer serviceId;
//
//    @Column(name = "Date")
//    private Date date;
//
//    @Column(name = "Notes")
//    private String notes;
//
//    @ManyToOne
//    @JoinColumn(name = "PatientID")
//    private Patient patient;
//
//    @ManyToOne
//    @JoinColumn(name = "CaregiverID")
//    private Caregiver caregiver;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Service service = (Service) o;
//        return serviceId == service.serviceId;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(serviceId);
//    }
//}
