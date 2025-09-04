package com.kadudev.SysManTel.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadudev.SysManTel.Entities.ServiceOrder;
import com.kadudev.SysManTel.Entities.ServiceOrderRole;
import com.kadudev.SysManTel.repository.ServiceOrderRepository;

@Service
public class ServiceOrderService {

    @Autowired
    private ServiceOrderRepository serviceOrderRepository;

    public List<ServiceOrder> findAll() {
        return serviceOrderRepository.findAll();
    }

    public ServiceOrder findById(Long id) {
        return serviceOrderRepository.findById(id).orElse(null);
    }

    public ServiceOrder save(ServiceOrder serviceOrder) {4
        if (serviceOrder.getId() == null){
            serviceOrder.setStatus(ServiceOrderRole.PENDING);
            serviceOrder.setOpeningDate(LocalDateTime.now());
        }
        return serviceOrderRepository.save(serviceOrder);
    }

    public void deleteById(Long id) {
        serviceOrderRepository.deleteById(id);
    }

}
