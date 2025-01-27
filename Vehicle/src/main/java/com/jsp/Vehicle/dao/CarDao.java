package com.jsp.Vehicle.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jsp.Vehicle.entity.Car;
import com.jsp.Vehicle.repository.CarRepo;

@Repository
public class CarDao {

	@Autowired
	private CarRepo crepo;

//	Save Car
	public Car saveCar(Car car) {
		return crepo.save(car);
	}

//	find by id
	public Car findCarById(int id) {
		Optional<Car> op = crepo.findById(id);
		if(op.isPresent()) {
			return op.get();
		}
		else {
			return null;
		}
	}


}
