package com.hp.streem.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.hp.streem.dto.ApplicationDTO;

public class ApplicationRunner {

	public static void main(String[] args) {
		
		
		Collection<ApplicationDTO> collection =new ArrayList<ApplicationDTO>();
		collection.add(new ApplicationDTO("Amazon", 2.5, true, "Jeff Bezos", 0));
		collection.add(new ApplicationDTO("Shadi.com", 3, false, "Anupam Mittal", 1258));
		collection.add(new ApplicationDTO("Buty Plus", 8, true, "Juse Golli", 0));
		collection.add(new ApplicationDTO("Google Photos", 6.8, false, "Jaidep", 2455));

	}
	
	collection.stream().filter(ele->ele.isFree()!=false || ele.getDevelopedBy()=="Google" || ele.getVersion()>5)
	.collect(Collectors.toSet()).forEach(dto->System.out.println(dto));
	
	System.out.println(System.lineSeparator());
	System.out.println("=====================================================");
	collection.stream().collect(Collectors.toSet()).forEach(dto->System.out.println(dto.getName()));

}
}
