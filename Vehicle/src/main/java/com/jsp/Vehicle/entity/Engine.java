package com.jsp.Vehicle.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Engine {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="ename")
	private String engineName;
	@Column(name="ebrand")
	private String engineBrand;
	
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL )
	private Car car;
}
