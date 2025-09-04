package com.kadudev.SysManTel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadudev.SysManTel.Entities.User;

public interface UserRepository extends JpaRepository<User, Long> 
{

}