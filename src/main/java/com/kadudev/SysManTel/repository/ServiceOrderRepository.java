package com.kadudev.SysManTel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadudev.SysManTel.Entities.ServiceOrder;

public interface ServiceOrderRepository extends JpaRepository<ServiceOrder, Long> 
{

}
