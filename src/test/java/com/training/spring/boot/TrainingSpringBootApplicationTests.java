package com.training.spring.boot;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.training.spring.boot.model.RaceCar;

@SpringBootTest
@ActiveProfiles("test")
class TrainingSpringBootApplicationTests {
	
	@Autowired
	private RaceCar teslaxTest;

	@Test
	void contextLoads() {
		// Simple test case
		Assert.assertEquals(2+2, 4);
	}
	
	@Test
	void testCreateCar() {
		String model = "x";
		String brand = "tesla";
		
		RaceCar car = new RaceCar(brand, model);
		
		Assert.assertEquals(model, car.getModel());
		Assert.assertEquals(brand, car.getBrand());
	}
	
	
	@Test
	void testCarInContext() {
		String model = "X";
		String brand = "Tesla";
		
		Assert.assertEquals(model, teslaxTest.getModel());
		Assert.assertEquals(brand, teslaxTest.getBrand());
	}
}
