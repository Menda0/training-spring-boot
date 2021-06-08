package com.training.spring.boot.service;

import com.training.spring.boot.model.RaceCar;

public interface ICarService {

	// Verify if car exists in db
	// Case car exists throw exception
	// Case car does not exist add car to database
	RaceCar addCar(String name, String model, String brand) throws Exception;
}
