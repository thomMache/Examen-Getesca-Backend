package com.thommache.sprintboot.app.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thommache.sprintboot.app.examen.entities.Team;

public interface TeamRepository extends JpaRepository<Team, Integer>{

}
