package com.xworkz.data.service;

import org.hibernate.validator.constraints.Length;

import com.xworkz.data.dto.PersonDTO;
import com.xworkz.data.repositary.PersonRepositary;

public class PersonServiceImpl implements PersionService {

	private PersonRepositary personRepositary;

	public PersonServiceImpl() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(PersonDTO dto) {

		PersonDTO personDTO = new PersonDTO();
		
		String voterId = dto.getVoterId();

		if (dto != null) {

			if (voterId.length() >= 8 &&voterId.length()<8 && voterId.matches(regexp=\\a\\)) {
				return true;

			} else {
				return false;
			}
			if (dto.getDLNo().matches() <= ) {
				return true;

			} else {
				return false;
			}

		} else {
			System.out.println("personDTO is poiinting to null");
		}

		return false;
	}

}
