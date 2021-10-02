package com.thommache.sprintboot.app.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.thommache.sprintboot.app.examen.entities.Sale;
import com.thommache.sprintboot.app.examen.services.SaleServices;


@RestController
@RequestMapping("/sales")
public class SalesController {
	
	
	@Autowired
	private SaleServices saleService;
	
	@GetMapping("/team/{id}")
	public ResponseEntity<List<Sale>> getSaleandTeamById(@PathVariable("id") Integer id){
		return new ResponseEntity<>(saleService.getSaleAndTeamById(id), HttpStatus.OK);
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<List<Sale>> getSaleandUserById(@PathVariable("id") Integer id){
		return new ResponseEntity<>(saleService.getSaleAndUserById(id), HttpStatus.OK);
	}

}
