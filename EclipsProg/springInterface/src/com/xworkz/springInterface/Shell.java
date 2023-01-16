package com.xworkz.springInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.springInterface.repository.Fuel;
import com.xworkz.springInterface.repository.PetrolBunk;

@Component
public class Shell implements PetrolBunk {
	@Autowired
	@Qualifier("petrol")
	private Fuel fuel;

	public Shell() {
		System.out.println("running shell");
	}

	@Override
	public void purchase() {
		// TODO Auto-generated method stub

	}
	//@Autowired
	//@Qualifier("fuel")
	public void quality() {
		fuel.consume();
	}

}
