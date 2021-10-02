package com.thommache.sprintboot.app.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thommache.sprintboot.app.examen.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
