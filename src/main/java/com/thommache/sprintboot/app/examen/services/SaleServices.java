package com.thommache.sprintboot.app.examen.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.thommache.sprintboot.app.examen.entities.Sale;
import com.thommache.sprintboot.app.examen.repository.SaleRepository;

@Service
public class SaleServices {
	
	private static final Logger log = LoggerFactory.getLogger(SaleServices.class);
	
	@Autowired
	public SaleRepository saleRepository;
	
	
	public List<Sale> getSaleAndTeamById(Integer id) {
		log.info("Getting saleAndTeam by id {}" , id);
		 return saleRepository.findByTeamId(id);
	}
	
	public List<Sale> getSaleAndUserById(Integer id) {
		log.info("Getting saleAndUser by id {}" , id);
		 return saleRepository.findByUserId(id);
				 //).orElseThrow(() -> 
		// new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("Sale and Team %d not found", id)));
		}

	

}
