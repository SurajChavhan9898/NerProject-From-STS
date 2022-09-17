package com.country.model;

import javax.persistence.*;

@Entity
@Table(name="Country")
public class Country {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int countryCode;
	private String countryName;
	private String countryLanguage;
	private int totalArea;
	private Long countryPolulation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryLanguage() {
		return countryLanguage;
	}
	public void setCountryLanguage(String countryLanguage) {
		this.countryLanguage = countryLanguage;
	}
	public int getTotalArea() {
		return totalArea;
	}
	public void setTotalArea(int totalArea) {
		this.totalArea = totalArea;
	}
	public Long getCountryPolulation() {
		return countryPolulation;
	}
	public void setCountryPolulation(Long countryPolulation) {
		this.countryPolulation = countryPolulation;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", countryCode=" + countryCode + ", countryName=" + countryName
				+ ", countryLanguage=" + countryLanguage + ", totalArea=" + totalArea + ", countryPolulation="
				+ countryPolulation + "]";
	}
	

}
