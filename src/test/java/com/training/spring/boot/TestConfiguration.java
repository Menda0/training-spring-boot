package com.training.spring.boot;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Bean;

import com.training.spring.boot.model.RaceCar;

@Profile("test")
@Configuration
public class TestConfiguration {

	@Bean
	public RaceCar teslaxTest() {
		return new RaceCar("Tesla", "X");
	}
}
