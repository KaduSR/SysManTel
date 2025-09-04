package com.kadudev.SysManTel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadudev.SysManTel.Entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> 
{

}
