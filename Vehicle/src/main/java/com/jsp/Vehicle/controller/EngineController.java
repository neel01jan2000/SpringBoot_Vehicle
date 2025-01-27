package com.jsp.Vehicle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Vehicle.entity.Engine;
import com.jsp.Vehicle.service.EngineService;
import com.jsp.Vehicle.util.ResponseStructure;

@RestController
public class EngineController {

	@Autowired
	private EngineService eservice;
	
//	save Engine
	@PostMapping("/saveEngine")
	public ResponseEntity<ResponseStructure<Engine>> saveEngine(@RequestParam int id,@RequestBody Engine enginee){
		return eservice.saveEngine(id,enginee);
	}
	
//	find by id
	@GetMapping("/getEngine")
	public ResponseEntity<ResponseStructure<Engine>> getEngineById(@RequestParam("id") int id){
		return eservice.getEngineByid(id);
	}
	
}
