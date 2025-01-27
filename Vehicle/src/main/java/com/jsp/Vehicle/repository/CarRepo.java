package com.jsp.Vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Vehicle.entity.Car;

public interface CarRepo extends JpaRepository<Car, Integer> {

}
