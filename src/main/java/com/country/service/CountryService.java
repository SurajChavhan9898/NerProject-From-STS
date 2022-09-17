package com.country.service;

import java.util.List;
import java.util.Optional;

import com.country.model.Country;

public interface CountryService {
	public Country saveCountry(Country country);
	public void deleteCountry(Integer id);
	public Optional<Country> getCountryById(Integer id);
	
	/* By using Native Query */
	public List<Country> getListByCountryName(String countryName);
    public List<Country> getListByCountryLanguage(String countryLanguage);
    public List<Country> getAllListById(int id);
}
