package com.micro.webClient.MicroWebClient.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.webClient.MicroWebClient.dto.Dto;

@RestController
public class Controller {

	
	@GetMapping(value ="/consult")
	public String consult() {
		
		
		return "Hello";
	}
	
	@GetMapping(value = "/listCars")
	public List<Dto> listCars(){
		
		Dto dto = new Dto();
		List<Dto> listDto = new ArrayList<Dto>();
		
		dto.setAnio("2018");
		dto.setCarro("Aveo");
		dto.setColor("Rojo quemado");
		
		for(int i=0; i<100; i++) {
			listDto.add(dto);
		}
		
		
		return listDto;
		
	}
}
