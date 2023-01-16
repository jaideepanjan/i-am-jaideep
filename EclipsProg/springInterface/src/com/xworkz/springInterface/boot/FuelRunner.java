package com.xworkz.springInterface.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springInterface.Shell;
import com.xworkz.springInterface.configuration.FuelConfiguration;
import com.xworkz.springInterface.repository.Petrol;
import com.xworkz.springInterface.repository.PetrolBunk;

public class FuelRunner {

	public static void main(String[] args) {
		
		ApplicationContext container=new AnnotationConfigApplicationContext(FuelConfiguration.class);
		PetrolBunk petrol=container.getBean(PetrolBunk.class);
		petrol.purchase();
		
	}

}
