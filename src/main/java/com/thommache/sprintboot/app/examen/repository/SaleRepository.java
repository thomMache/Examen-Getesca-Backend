package com.thommache.sprintboot.app.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.thommache.sprintboot.app.examen.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Integer>{
		
	@Query("SELECT a FROM Sale a where a.user.team.id=?1")
	List<Sale> findByTeamId(Integer id);
	
	@Query("SELECT a FROM Sale a where a.user.id=?1")
	List<Sale> findByUserId(Integer id);

}
