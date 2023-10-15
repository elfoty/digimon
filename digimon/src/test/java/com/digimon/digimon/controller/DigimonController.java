package com.digimon.digimon.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping(value = "/digimon")
public class DigimonController {

	@GetMapping
	public String getDigimons()
	{
		RestTemplate restTemplate = new RestTemplate();
		
		String url = "https://digimon-api.vercel.app/api/digimon";
		
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        
		return responseEntity.getBody();
	}
}
