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

import com.kadudev.SysManTel.Entities.Customer;
import com.kadudev.SysManTel.Service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public ResponseEntity<List<Customer>> findAll() {
        List<Customer> list = customerService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Customer> create(@RequestBody Customer customer) {
        customer = customerService.save(customer);
        return ResponseEntity.ok().body(customer);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Customer> findById(@PathVariable Long id) {
        Customer customer = customerService.findById(id);
        return ResponseEntity.ok().body(customer);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Customer> update(@PathVariable Long id, @RequestBody Customer customer) {
        customer = customerService.update(id, customer);
        return ResponseEntity.ok().body(customer);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        customerService.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}