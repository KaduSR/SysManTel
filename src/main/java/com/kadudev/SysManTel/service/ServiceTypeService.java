package com.kadudev.SysManTel.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadudev.SysManTel.Entities.ServiceType;
import com.kadudev.SysManTel.Repository.ServiceTypeRepository;

@Service
public class ServiceTypeService {
    @Autowired
    private ServiceTypeRepository serviceTypeRepository;

    public List<ServiceType> findAll() {
        return serviceTypeRepository.findAll();
    }

    public ServiceType findById(Long id) {
        return serviceTypeRepository.findById(id).orElse(null);
    }

    public ServiceType save(ServiceType serviceType) {
        return serviceTypeRepository.save(serviceType);
    }

    public void deleteById(Long id) {
        serviceTypeRepository.deleteById(id);
    }

    public ServiceType update(Long id, ServiceType serviceType) {
        ServiceType existingServiceType = serviceTypeRepository.findById(id).orElse(null);
        if (existingServiceType != null) {
            existingServiceType.setName(serviceType.getName());
            return serviceTypeRepository.save(existingServiceType);
        }
        return null;
    }
}
