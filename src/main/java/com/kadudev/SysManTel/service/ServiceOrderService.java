package com.kadudev.SysManTel.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadudev.SysManTel.Entities.ServiceOrder;
import com.kadudev.SysManTel.Entities.ServiceOrderRole;
import com.kadudev.SysManTel.Repository.ServiceOrderRepository;

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

    public ServiceOrder save(ServiceOrder serviceOrder) {
        if (serviceOrder.getId() == null){
            serviceOrder.setStatus(ServiceOrderRole.PENDING);
            serviceOrder.setOpeningDate(LocalDateTime.now());
        }
        return serviceOrderRepository.save(serviceOrder);
    }

    public void deleteById(Long id) {
        serviceOrderRepository.deleteById(id);
    }

    public ServiceOrder update(Long id, ServiceOrder serviceOrder) {
        ServiceOrder existingOrder = findById(id);
        existingOrder.setCustomer(serviceOrder.getCustomer());
        existingOrder.setProblemDescription(serviceOrder.getProblemDescription());
        existingOrder.setSolutionDescription(serviceOrder.getSolutionDescription());
        existingOrder.setStatus(serviceOrder.getStatus());
        existingOrder.setClosingDate(serviceOrder.getClosingDate());
        existingOrder.setTechnician(serviceOrder.getTechnician());
        return serviceOrderRepository.save(existingOrder);
    }

}
