package com.training.spring.boot.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.training.spring.boot.model.RaceCar;

@Repository
public class CarRepository implements ICarRepository{
	
	private Map<String, RaceCar> cars;
	
	public CarRepository() {
		this.cars = new HashMap<String, RaceCar>();
	}

	@Override
	public RaceCar create(String name, String model, String brand) {
		RaceCar car = new RaceCar(brand, model);
		this.cars.put(name, car);
		return car;
	}

	@Override
	public RaceCar delete(String name) {
		return this.cars.remove(name);
	}

	@Override
	public RaceCar get(String name) {
		return this.cars.get(name);
	}

	@Override
	public boolean exists(String name) {
		return this.cars.containsKey(name);
	}

	@Override
	public Collection<RaceCar> list() {
		return this.cars.values();
	}

}
