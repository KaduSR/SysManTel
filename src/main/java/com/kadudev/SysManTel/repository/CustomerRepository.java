package com.kadudev.SysManTel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadudev.SysManTel.Entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
