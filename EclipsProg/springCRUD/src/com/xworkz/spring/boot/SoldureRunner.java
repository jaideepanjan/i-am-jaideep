package com.xworkz.spring.boot;

import com.xworkz.spring.dto.SoldureDTO;
import com.xworkz.spring.services.SoldureService;
import com.xworkz.spring.services.SoldureServiceImp;

public class SoldureRunner {

	public static void main(String[] args) {
		SoldureDTO dto=new SoldureDTO();
		
		dto.setName("Jaideep P");
		dto.setAge(23);
		dto.setFrom("Shivamogga");
		dto.setTeamName("Parashuram");
		dto.setIdNumber(159);

		SoldureService service=new SoldureServiceImp();
		service.soldure(dto);
	}

}
