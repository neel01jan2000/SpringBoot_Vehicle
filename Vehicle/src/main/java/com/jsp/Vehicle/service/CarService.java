package com.jsp.Vehicle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.Vehicle.dao.CarDao;
import com.jsp.Vehicle.dao.EngineDao;
import com.jsp.Vehicle.entity.Car;
import com.jsp.Vehicle.entity.Engine;
import com.jsp.Vehicle.util.ResponseStructure;

@Service
public class CarService {

	@Autowired
	private CarDao cdao;
	private EngineDao edao;
	
//	Save Car
	public ResponseEntity<ResponseStructure<Car>> saveCar(Car car) {
		ResponseStructure<Car> rs = new ResponseStructure<Car>();
			
			rs.setData(cdao.saveCar(car));
			rs.setMessage("Car save");
			rs.setStatusCode(HttpStatus.CREATED.value());
			return new ResponseEntity<ResponseStructure<Car>>(rs,HttpStatus.CREATED);
		}

	
//	Find by id
	public ResponseEntity<ResponseStructure<Car>> findCarById(int id) {
		ResponseStructure<Car> rs = new ResponseStructure<Car>();
		Car c = cdao.findCarById(id);
		rs.setData(c);
		rs.setMessage("Success");
		rs.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Car>>(rs,HttpStatus.OK);
	}

}
