package com.training.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.boot.service.ICarService;

class RaceCarDto{
	private String name;
	private String brand;
	private String model;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}


// Exercise
// 1. Create an endpoint of method:GET with route:/cars which list a list of cars in my application


// GET /cars - list all cars
// PUT-POST /cars - Add car
// GET /cars/<id> - Get car with id
// PUT-POST /cars/<id> - Update cart with id

// GET /cars/<id>/engine - 


@RestController
public class RaceCarController {
	
	@Autowired
	private ICarService carService;

	@RequestMapping(value="/cars", method=RequestMethod.POST)
	public ResponseEntity<Object> addCar(@RequestBody RaceCarDto raceCarDto) {
		try {
			carService.addCar(raceCarDto.getName(), raceCarDto.getModel(), raceCarDto.getBrand());
			return new ResponseEntity<>("Race car created successfully", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("Race car already exists", HttpStatus.BAD_REQUEST);
		}
	}
}
