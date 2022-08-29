package com.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weather.entities.WeatherLocation;

@Repository
public interface WeatherLocationRepository extends JpaRepository<WeatherLocation, Integer>{	
	
}
