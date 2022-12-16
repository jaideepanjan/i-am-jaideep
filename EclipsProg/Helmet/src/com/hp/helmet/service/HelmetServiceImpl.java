package com.hp.helmet.service;

import com.hp.helmet.dto.HelmetDTO;
import com.hp.helmet.repository.HelmetRepositary;
import com.hp.helmet.service.HelmetService;

public class HelmetServiceImpl implements HelmetService  {
	
	private HelmetRepositary helmetRepositary;
	
	

	public HelmetServiceImpl(HelmetRepositary helmetRepositary) {
		this.helmetRepositary = helmetRepositary;
	}



	@Override
	public boolean validation(HelmetDTO dto) {
		
		
		boolean valideBrand=false;
		boolean valideType=false;
		boolean validePrice=false;
		boolean valideColor=false;
		
		if(dto.getBrand().length()>4&&dto.getBrand().length()<=15) {
			System.out.println("Valid Brand : "+dto.getBrand());
			valideBrand=true;
		}
		else {
			System.err.println("Invalid Brand"+dto.getBrand());
		}
		if(dto.getType()!=null) {
			System.out.println("Valid Type : "+dto.getType());
			valideType=true;
		}
		else {
			System.err.println("Invalid type"+dto.getType());
		}
		if(dto.getPrice()<=700&&dto.getPrice()>=20000) {
			System.out.println("Valid price"+dto.getPrice());
			validePrice=true;
		}
		else {
			System.out.println("Invalid price"+dto.getPrice());
		}
		if(dto.getColor()!=null) {
			System.out.println("Valied colour "+dto.getColor());
			valideColor=true;
		}
		else {
			System.out.println("Invalid colour"+dto.getColor());
		}
		if(valideBrand&&valideColor&&validePrice&&valideType) {
			System.out.println("Helmet DTO is valid it can save in the repositary");
		    boolean save=this.helmetRepositary.saved(dto);
		    return true;
		}
		
		
		
		
		return false;
	}
	
	
	

}
