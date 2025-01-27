package com.jsp.Vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Vehicle.entity.Engine;

public interface EngineRepo extends JpaRepository<Engine, Integer>{

}
