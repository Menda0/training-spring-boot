package com.training.spring.boot.repository;

import java.util.Collection;

import com.training.spring.boot.model.RaceCar;

public interface ICarRepository {

	RaceCar create(String name, String model, String brand);
	
	RaceCar delete(String name);
	
	RaceCar get(String name);
	
	boolean exists(String name);
	
	Collection<RaceCar> list();
}
