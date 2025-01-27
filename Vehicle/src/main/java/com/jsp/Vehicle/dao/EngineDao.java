package com.jsp.Vehicle.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jsp.Vehicle.entity.Engine;
import com.jsp.Vehicle.repository.EngineRepo;

@Repository
public class EngineDao {

	@Autowired
	private EngineRepo erepo;
	
//	save Engine
	public Engine saveEngine(Engine engine) {
		return erepo.save(engine);
	}
	
	
//	find Engine By Id
	public Engine findEngineById(int id) {
		Optional<Engine> op = erepo.findById(id);
		if(op.isPresent()) {
			return op.get();
		}
		else {
			return null;
		}
	}

	

}
