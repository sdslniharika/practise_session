package com.soccerresort.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.soccerresort.constants.Country;
import com.soccerresort.constants.Hobby;
import com.soccerresort.constants.Language;
import com.soccerresort.entity.GuestDetails;

public class GuestService {

	public Map<Integer, GuestDetails> guestDetails = new HashMap<>();

	private int index = 0;

	public int guestIndex() {
		return index++;
	}

	public void populateGuest(GuestDetails details) {

		int key = guestIndex();
		guestDetails.put(key, details);

	}

	public void filterGuest() {
		Collection<GuestDetails> guestCollection = guestDetails.values();

		List<GuestDetails> guestList = new ArrayList<>();

		guestList.addAll(guestCollection);

		guestList.stream().filter(c -> Period.between(c.getDateOfBirth(), LocalDate.now()).getYears() > 18);

		guestList.stream()
				.filter(c -> c.getCountry().equals(Country.SPAIN) && c.getHobby().equals(Hobby.MUSIC)
						|| c.getHobby().equals(Hobby.DANCE))
				.forEach(guest -> System.out.println(guest.getCustomerName() + " " + guest.getDateOfBirth() + " "
						+ guest.getCountry() + " " + guest.getHobby() + " " + guest.getLanguage()));

		guestList.stream()
				.filter(c -> c.getCountry().equals(Country.SPAIN) && c.getHobby().equals(Hobby.DRINK)
						&& Period.between(c.getDateOfBirth(), LocalDate.now()).getYears() > 18)
				.forEach(guest -> System.out.println(guest.getCustomerName() + " " + guest.getDateOfBirth() + " "
						+ guest.getCountry() + " " + guest.getHobby() + " " + guest.getLanguage()));

		guestList.stream().filter(c -> c.getCountry().equals(Country.FRANCE) && c.getHobby().equals(Hobby.WATERSPORTS))
				.forEach(guest -> System.out.println(guest.getCustomerName() + " " + guest.getDateOfBirth() + " "
						+ guest.getCountry() + " " + guest.getHobby() + " " + guest.getLanguage()));

		long count = guestList.stream().filter(c -> Period.between(c.getDateOfBirth(), LocalDate.now()).getYears() > 70)
				.count();
		System.out.println(count);

		guestList.stream().filter(c -> c.getLanguage().equals(Language.CHINESE) && c.getHobby().equals(Hobby.READ))
				.forEach(guest -> System.out.println(guest.getCustomerName() + " " + guest.getDateOfBirth() + " "
						+ guest.getCountry() + " " + guest.getHobby() + " " + guest.getLanguage()));
	}

//	private int index = 0;
//
//	public int guestIndex() {
//		return index++;
//	}
//	
//	public GuestDetails addGuest(GuestDetails details) {
//		
//		int key=guestIndex();
//		guestDetails.put(key, details);
//		
//		return details;
//	}

//	public List<GuestDetails> guestBasedOnCountry(Country country)
//	{
//		Collection<GuestDetails> guestCollection =guestDetails.values();
//		
//	List<GuestDetails>	guestFromSpain= guestCollection.stream().filter(c->c.getCountry().equals(Country.SPAIN)).collect(Collectors.toList());
//		
//	return 	guestFromSpain.stream().filter(c->c.getHobby().equals(Hobby.DANCE) || c.getHobby().equals(Hobby.MUSIC)).collect(Collectors.toList());
//	
//	
//	//return guestCollection.stream().filter(c->c.getCountry().equals(country)).collect(Collectors.toList());
//		
//		
//	}
//	
//	public List<GuestDetails> guestBasedOnHobby(Hobby hobby)
//	{
//		Collection<GuestDetails> guestCollection =guestDetails.values();
//		
//		return guestCollection.stream().filter(c->c.getHobby().equals(hobby)).collect(Collectors.toList());
//	}
//	
//	public List<GuestDetails> guestBasedOnHobby(Hobby hobby)
//	{
//		Collection<GuestDetails> guestCollection =guestDetails.values();
//		
//		return guestCollection.stream().filter(c->c.getHobby().equals(hobby)).collect(Collectors.toList());
//	}
}
