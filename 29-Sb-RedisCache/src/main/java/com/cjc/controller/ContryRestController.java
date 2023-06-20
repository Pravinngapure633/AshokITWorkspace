package com.cjc.controller;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.binding.Country;

@RestController
public class ContryRestController {

	private HashOperations<String, Integer, Country> opsForHash=null;
	
	@Autowired
	public ContryRestController(RedisTemplate<String, Country> rt) {
		this.opsForHash=rt.opsForHash();
	}
	
	@PostMapping("/country")
	public String addCountry(@RequestBody Country country) {
		
		opsForHash.put("Countries", country.getSrno(), country);
		return "Country Added";
	}

	@GetMapping("/countries")
	public Collection<Country> getCountries() {
		
		Map<Integer, Country> entries = opsForHash.entries("Countries");
		
		Collection<Country> values = entries.values();
		return values;
	}
}
