package com.HP.association.boot;

import com.HP.association.things.Address;
import com.HP.association.things.City;
import com.HP.association.things.Companyy;
import com.HP.association.things.Country;
import com.HP.association.things.Email;
import com.HP.association.things.Job;
import com.HP.association.things.Person;
import com.HP.association.things.State;

public class PersonRunner {

	public static void main(String[] args) {
		Person person = new Person("jaideep");

		person.setJob(null);
		Job job = new Job(325F, "assistance", true);
		job.setCompany(null);
		Country country = new Country("India", 139.34, 7.44f, "Delhi");

		Companyy companyy = new Companyy("X-Workz", "Omkar");
		Address address = new Address();
		address.setLocation(null);
		City city = new City("Bangalure", "Kempe Gowda", 1830, "Silicpn City", 741);
		State state = new State("Karnataka", "Basavaraj Bomai", 47, "Kannada");
		Email email = new Email(1017, "avalakki", 658741366L);
		email.setCompanyy(null);
		Email email2 = new Email(1256, "jdshjdg", 9974563201L);

		Email[] many = { email, email2 };
		person.setEmail(many);
		person.printMadu();

	}

}
