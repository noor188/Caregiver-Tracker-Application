//package com.Caregiver.org.service;
//
//import com.Caregiver.org.repository.ServiceRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ServiceService {
//
//    private ServiceRepository serviceRepository;
//
//    public List<Service> getAllServices(){
//        return serviceRepository.findAll();
//    }
//
//    public Optional<Service> getServiceById(Integer id){
//        return serviceRepository.findById(id);
//    }
//
//    public Service saveSerive(Service service){
//        return serviceRepository.save(service);
//    }
//
//    public void deleteService(Integer id){
//        serviceRepository.deleteById(id);
//    }
//}
