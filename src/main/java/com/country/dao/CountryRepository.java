package com.country.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.country.model.Country;

public interface CountryRepository extends JpaRepository<Country,Serializable>{
	
	 @Query(value="select * from country where country_name=?", nativeQuery=true)
	public List<Country> findByCountryName(String countryName);
	 
	 @Query(value= "select * from country where country_language=?" , nativeQuery=true )
		public List<Country> findByCountryLanguage(String countryLanguage);

	 @Query(value="select * from country where id=id",nativeQuery=true)
	 public List<Country> getAllList(int id);
}
