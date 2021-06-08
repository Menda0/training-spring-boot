package com.training.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.boot.model.RaceCar;

@SpringBootApplication
@RestController
public class TrainingSpringBootApplication {
	
	// Create a engine
	// Inject a engine in every car on the application
	// Create a car name Ford GT
	
	@Autowired
	public RaceCar teslax;
	
	@Autowired 
	@Qualifier(value="teslay")
	public RaceCar teslay;

	public static void main(String[] args) {
		SpringApplication.run(TrainingSpringBootApplication.class, args);
	}
	
	@RequestMapping(value="/")
	public String helloworld() {
		return "Helloworld";
	}
	
	@RequestMapping(value="/teslax")
	public String getTeslaX() {
		return this.teslax.toString();
	}
	
	@RequestMapping(value="/teslay")
	public String getTeslaY() {
		return this.teslay.toString();
	}

}
