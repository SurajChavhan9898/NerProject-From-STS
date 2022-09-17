package com.country.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.country.dao.CountryRepository;
import com.country.model.Country;
@Service
public class CountryServiceImlp implements CountryService{
		
		@Autowired
		private CountryRepository countryRepository;
		
		@Override
		public Country saveCountry(Country country) {
		return countryRepository.save(country);
	}

		@Override
		public void deleteCountry(Integer id) {
			countryRepository.deleteById(id);
		}

		@Override
		public Optional<Country> getCountryById(Integer id) {
		Optional<Country> country= countryRepository.findById(id);
		return country;
		}

		@Override
		public List<Country> getListByCountryName(String countryName) {
			List<Country> list=countryRepository.findByCountryName(countryName);
			return list;
		}

		@Override
		public List<Country> getListByCountryLanguage(String countryLanguage) {
				List<Country> list=countryRepository.findByCountryLanguage(countryLanguage);
				return list;
		}

		@Override
		public List<Country> getAllListById(int id) {
			List<Country> list=countryRepository.getAllList(id);
			return list;
		}

}
