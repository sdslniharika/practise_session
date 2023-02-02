package com.soccerresort.entity;

import java.time.LocalDate;
import java.util.Date;

import com.soccerresort.constants.Country;
import com.soccerresort.constants.Hobby;
import com.soccerresort.constants.Language;

public class GuestDetails {
	
	String customerName;
	
	LocalDate dateOfBirth;
	
	Country country;
	
	Language language;
	
	Hobby hobby;
	
	
	public GuestDetails() {
	}


	public GuestDetails(String customerName, LocalDate dateOfBirth, Country country, Language language, Hobby hobby) {
		super();
		this.customerName = customerName;
		this.dateOfBirth = dateOfBirth;
		this.country = country;
		this.language = language;
		this.hobby = hobby;
	}
	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Hobby getHobby() {
		return hobby;
	}

	public void setHobby(Hobby hobby) {
		this.hobby = hobby;
	}

	
	
	

}
