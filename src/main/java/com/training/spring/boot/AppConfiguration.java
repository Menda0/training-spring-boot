package com.training.spring.boot;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.training.spring.boot.model.RaceCar;
import com.training.spring.boot.repository.CarRepository;
import com.training.spring.boot.repository.ICarRepository;
import com.training.spring.boot.service.CarService;
import com.training.spring.boot.service.ICarService;

import org.springframework.context.annotation.Bean;

@Configuration
public class AppConfiguration {

	@Bean
	public RaceCar teslax() {
		return new RaceCar("Tesla", "x");
	}
	
	@Bean
	public RaceCar teslay() {
		return new RaceCar("Tesla", "y");
	}
	
	// We dont need to explicitly declare repository and services beans
	// Use @Service and @Repository to create the beans on our application context
//	@Bean
//	public ICarRepository carRepository() {
//		return new CarRepository();
//	}
//	
//	@Bean
//	public ICarService carService() {
//		return new CarService();
//	}
}
