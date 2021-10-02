package com.thommache.sprintboot.app.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thommache.sprintboot.app.examen.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

}
