package com.sapient.weatherApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sapient.weatherApi.model.WeatherApiResponse;

@Service
public class WeatherService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	public WeatherApiResponse getWeatherByCity(String city) {
		
		final String uri = "http://api.openweathermap.org/data/2.5/forecast?q=London&appid=d2929e9483efc82c82c32ee7e02d563e";
		WeatherApiResponse response= restTemplate.getForObject(uri, WeatherApiResponse.class);
		return response;
		
		
	}

}
