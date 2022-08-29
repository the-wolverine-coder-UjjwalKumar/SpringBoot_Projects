package com.weather.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.entities.WeatherLocation;
import com.weather.repository.WeatherLocationRepository;

@RestController
public class WeatherLocationController {
	
	@Autowired
	private WeatherLocationRepository weatherLocationRepository;
	
	@RequestMapping(path = "/locations")
	public List<WeatherLocation> getLocations(){
		
		System.out.println("hello");
		return weatherLocationRepository.findAll();
	}
	
	@RequestMapping(path = "/test")
	public String getString(){
		
		return "hello";
	}
}
