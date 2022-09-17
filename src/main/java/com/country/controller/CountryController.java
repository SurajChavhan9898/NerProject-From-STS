package com.country.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.country.model.Country;
import com.country.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {
	
	/*
	 * Logger logger = LoggerFactory.getLogger(CountryController.class); // pass
	 * your class name writes>logger.info("In login service method");
	 */
	private static final Logger log=LoggerFactory.getLogger(CountryController.class);
	
	

	@Autowired
	private CountryService countryService;

	@PostMapping("/save")
	public ResponseEntity<Country> saveCountry(@RequestBody Country country) {
		Country con = countryService.saveCountry(country);
		return ResponseEntity.ok().body(con);
	}

	@GetMapping("/getCountry/{id}")
	public ResponseEntity<Optional<Country>> getCountryById(@PathVariable("id") Integer id) {
		Optional<Country> con = countryService.getCountryById(id);
		return ResponseEntity.ok().body(con);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteCountryById(@PathVariable("id") Integer id) throws Exception {
		countryService.deleteCountry(id);
	}

	@GetMapping("/countryname/{countryName}")
	public ResponseEntity<List<Country>> getListByCountryName(@PathVariable("countryName") String countryName) {
		List<Country> list = countryService.getListByCountryName(countryName);
		return ResponseEntity.ok().body(list);

	}

	@GetMapping("/language/{countryLanguage}")
	public ResponseEntity<List<Country>> getListByCountryLanguage(
			@PathVariable("countryLanguage") String countryLanguage) {
		List<Country> list = countryService.getListByCountryLanguage(countryLanguage);
		return ResponseEntity.ok().body(list);
	}

	@GetMapping("/allbyid/{id}")
	public ResponseEntity<List<Country>> getAllList(@PathVariable("id") int id) {
		List<Country> list = countryService.getAllListById(id);
		return ResponseEntity.ok().body(list);
	}

}
