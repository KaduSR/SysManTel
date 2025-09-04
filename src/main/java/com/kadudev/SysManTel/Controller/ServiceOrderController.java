package com.kadudev.SysManTel.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kadudev.SysManTel.Entities.ServiceOrder;
import com.kadudev.SysManTel.Service.ServiceOrderService;

@RestController
@RequestMapping("/service-orders")
public class ServiceOrderController {
    @Autowired
    private ServiceOrderService serviceOrderService;

    @GetMapping
    public ResponseEntity<List<ServiceOrder>> findAll() {
        List<ServiceOrder> list = serviceOrderService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<ServiceOrder> create(@RequestBody ServiceOrder serviceOrder) {
        serviceOrder = serviceOrderService.save(serviceOrder);
        return ResponseEntity.ok().body(serviceOrder);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ServiceOrder> findById(@PathVariable Long id) {
        ServiceOrder serviceOrder = serviceOrderService.findById(id);
        return ResponseEntity.ok().body(serviceOrder);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ServiceOrder> update(@PathVariable Long id, @RequestBody ServiceOrder serviceOrder) {
        serviceOrder = serviceOrderService.update(id, serviceOrder);
        return ResponseEntity.ok().body(serviceOrder);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        serviceOrderService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    

}
