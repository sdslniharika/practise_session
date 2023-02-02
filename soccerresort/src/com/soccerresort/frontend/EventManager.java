package com.soccerresort.frontend;

import java.time.LocalDate;

import com.soccerresort.constants.Country;
import com.soccerresort.constants.Hobby;
import com.soccerresort.constants.Language;
import com.soccerresort.entity.GuestDetails;
import com.soccerresort.service.GuestService;

public class EventManager {

	public static void main(String args[]) {
		GuestService guestService = new GuestService();

		LocalDate dob = LocalDate.of(1998, 6, 10);
		GuestDetails guest1 = new GuestDetails("Adam", dob, Country.SPAIN, Language.CHINESE, Hobby.DANCE);
		guestService.populateGuest(guest1);

		GuestDetails guest2 = new GuestDetails("Eva", LocalDate.of(1998, 6, 10), Country.FRANCE, Language.CHINESE,
				Hobby.DANCE);
		guestService.populateGuest(guest2);

		GuestDetails guest3 = new GuestDetails("Elen", LocalDate.of(1988, 7, 10), Country.SPAIN, Language.CHINESE,
				Hobby.DANCE);
		guestService.populateGuest(guest3);

		GuestDetails guest4 = new GuestDetails("Allen", LocalDate.of(1970, 3, 10), Country.SPAIN, Language.CHINESE,
				Hobby.DRINK);
		guestService.populateGuest(guest4);

		GuestDetails guest5 = new GuestDetails("Dolly", LocalDate.of(1951, 4, 10), Country.SPAIN, Language.CHINESE,
				Hobby.DANCE);
		guestService.populateGuest(guest5);

		GuestDetails guest6 = new GuestDetails("Den", LocalDate.of(2000, 8, 10), Country.FRANCE, Language.CHINESE,
				Hobby.WATERSPORTS);
		guestService.populateGuest(guest6);

		GuestDetails guest7 = new GuestDetails("Uri", LocalDate.of(1996, 1, 10), Country.SPAIN, Language.CHINESE,
				Hobby.READ);
		guestService.populateGuest(guest7);

		guestService.filterGuest();

	}
}
