package com.weather.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com.weather.*" })
@EntityScan(basePackages = { "com.weather.entities" })
@EnableJpaRepositories(basePackages = { "com.weather.repository" })
@EnableJpaAuditing
@SpringBootConfiguration
public class WeatherLocationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherLocationServiceApplication.class, args);
	}

}
