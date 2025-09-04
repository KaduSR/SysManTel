package com.kadudev.SysManTel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadudev.SysManTel.Entities.ServiceOrder;

public interface ServiceOrderRepository extends JpaRepository<ServiceOrder, Long> 
{

}
