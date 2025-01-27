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
public class EngineService {

	@Autowired
	private EngineDao edao;
	@Autowired
	private CarDao cdao;
	
//	save Engine with respect to car present
	public ResponseEntity<ResponseStructure<Engine>> saveEngine(int id,Engine engine) {
		ResponseStructure<Engine> rs = new ResponseStructure<Engine>();
		
		Car c=cdao.findCarById(id);
		if(c!=null) {
			
			Engine eg = edao.saveEngine(engine);
			eg.setCar(c);
			
			cdao.saveCar(c);
			
			rs.setData(eg);
			rs.setMessage("Engine Record Saved");
			rs.setStatusCode(HttpStatus.CREATED.value());
			return new ResponseEntity<ResponseStructure<Engine>>(rs,HttpStatus.CREATED);
		}
		
		rs.setMessage("Engine Record Not Saved");
		rs.setStatusCode(HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<ResponseStructure<Engine>>(rs,HttpStatus.BAD_REQUEST);
		
	}

//	find Engine by id
	public ResponseEntity<ResponseStructure<Engine>> getEngineByid(int id) {
		ResponseStructure<Engine> rs= new ResponseStructure<Engine>();
		Engine e = edao.findEngineById(id);
		rs.setData(e);
		rs.setMessage("Success");
		rs.setStatusCode(HttpStatus.OK.value());
		
		return new ResponseEntity<ResponseStructure<Engine>>(rs,HttpStatus.OK);
		
	}

}
