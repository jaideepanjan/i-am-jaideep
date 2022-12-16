package com.hp.helmet.boot;

import com.hp.helmet.constant.Color;
import com.hp.helmet.constant.HelmetType;
import com.hp.helmet.dto.HelmetDTO;
import com.hp.helmet.repository.HelmetRepositary;
import com.hp.helmet.repository.HelmetRepositaryImpl;
import com.hp.helmet.service.HelmetService;
import com.hp.helmet.service.HelmetServiceImpl;

public class HelmetRunner {

	public static void main(String[] args) {


		HelmetRepositary repositary =new HelmetRepositaryImpl();
		HelmetDTO dto =new HelmetDTO("Machine", "HelmetType.HALFFACE", 1200, "Color.GREEN");
		
		HelmetService service=new HelmetServiceImpl(repositary);
		boolean suceed = service.validation(dto);
		System.out.println("Sucess : "+suceed);

	}

}
