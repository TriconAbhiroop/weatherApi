package com.sapient.weatherApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.weatherApi.model.City;
import com.sapient.weatherApi.model.WeatherApiResponse;
import com.sapient.weatherApi.service.WeatherService;

@RestController
public class WeatherController {
	
	@Autowired
	WeatherService weatherService;
	
	@RequestMapping(value = "/forecast/city", method = RequestMethod.GET)
	public WeatherApiResponse getWeatherByCity(@RequestParam("city")String city) {
		
		return weatherService.getWeatherByCity(city);
	}

}
