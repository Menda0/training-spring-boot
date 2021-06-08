package com.training.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.spring.boot.model.RaceCar;
import com.training.spring.boot.repository.ICarRepository;

@Service
public class CarService implements ICarService{
	
	@Autowired
	ICarRepository carRepository;

	// 1. Verify if car exists in db
	// 1.1 Case car exists throw exception
	// 1.2 Case car does not exist add car to database
	@Override
	public RaceCar addCar(String name, String model, String brand) throws Exception {
		if(carRepository.exists(name)) {
			throw new Exception("Car already exists");
		}else {
			return carRepository.create(name, model, brand);
		}
	}

}
