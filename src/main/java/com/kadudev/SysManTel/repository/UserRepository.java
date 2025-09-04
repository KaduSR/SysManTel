package com.kadudev.SysManTel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadudev.SysManTel.Entities.User;

public interface UserRepository extends JpaRepository<User, Long> 
{

}