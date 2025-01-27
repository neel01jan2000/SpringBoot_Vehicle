package com.jsp.Vehicle.util;

import lombok.Data;

@Data
public class ResponseStructure<T> {

	private T data;
	private String message;
	private int statusCode;
	
}
