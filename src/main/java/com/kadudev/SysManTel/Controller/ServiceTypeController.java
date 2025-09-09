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

import com.kadudev.SysManTel.Entities.ServiceType;
import com.kadudev.SysManTel.Service.ServiceTypeService;

@RestController
@RequestMapping("/servicetypes")
public class ServiceTypeController {


    @Autowired
    private ServiceTypeService serviceTypeService;

    @GetMapping
    public ResponseEntity<List<ServiceType>> findAll() {
        List<ServiceType> list = serviceTypeService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<ServiceType> create(@RequestBody ServiceType serviceType) {
        serviceType = serviceTypeService.save(serviceType);
        return ResponseEntity.ok().body(serviceType);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ServiceType> findById(@PathVariable Long id) {
        ServiceType serviceType = serviceTypeService.findById(id);
        return ResponseEntity.ok().body(serviceType);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ServiceType> update(@PathVariable Long id, @RequestBody ServiceType serviceType) {
        serviceType = serviceTypeService.update(id, serviceType);
        return ResponseEntity.ok().body(serviceType);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        serviceTypeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}