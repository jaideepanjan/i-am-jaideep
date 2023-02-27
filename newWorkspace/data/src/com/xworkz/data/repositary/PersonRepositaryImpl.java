package com.xworkz.data.repositary;

import com.xworkz.data.dto.PersonDTO;

public class PersonRepositaryImpl implements PersonRepositary {
	
	public PersonRepositaryImpl() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}

	@Override
	public boolean save(PersonDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
