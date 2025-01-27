package com.jsp.Vehicle.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String model;
	private String color;
	
    @JoinColumn
	@OneToOne(mappedBy="car")
	private Engine enginee;
}
