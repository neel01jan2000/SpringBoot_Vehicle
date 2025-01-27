package com.jsp.Vehicle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Vehicle.entity.Car;
import com.jsp.Vehicle.service.CarService;
import com.jsp.Vehicle.util.ResponseStructure;

@RestController
public class CarController {

	@Autowired
	private CarService cservice;
	
	
	@PostMapping("/saveCar")
	public ResponseEntity<ResponseStructure<Car>> saveCar(@RequestBody Car car){
		return cservice.saveCar(car);
	}
	
//	find by id
	
	@GetMapping("/getCar/{id}")
	public ResponseEntity<ResponseStructure<Car>> findCarById(@PathVariable int id){
		return cservice.findCarById(id);
	}
}
