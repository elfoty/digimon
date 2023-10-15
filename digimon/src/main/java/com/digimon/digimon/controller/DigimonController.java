package com.digimon.digimon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.digimon.digimon.entity.Digimon;


@RestController
@RequestMapping(value = "/digimon")
public class DigimonController {

	@GetMapping
	public List<Digimon> getDigimons()
	{
		List<Digimon> digimons = new ArrayList<Digimon>();
		
		RestTemplate restTemplate = new RestTemplate();
		
		String url = "https://digimon-api.vercel.app/api/digimon";
		
		ResponseEntity<List<Digimon>> responseEntity = restTemplate.exchange(url, 
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Digimon>>() {
				});
        digimons = responseEntity.getBody();;
		return digimons;
	}
}
