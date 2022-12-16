package com.hp.piazza.repositary;

import com.hp.piazza.constant.PiazzaSize;
import com.hp.piazza.dto.PiazzaDTO;

public class PizzaRepositaryImpl implements PizzaRepositary {
	
	public int VEG,NONVEG;

	@Override
	public boolean validation(PiazzaDTO dto) {
		System.out.println("Running the validation DTO" +dto);
		
		String name=dto.getName();
		double price=dto.getPrice();
		String company=dto.getCompany();
		PiazzaSize size=dto.getSize();
		String flavour=dto.getFlavour();
		String type=dto.getType();
		boolean validSize=false;
		boolean validCompany=false;
		boolean validName=false;
		boolean validPrice=false;
		boolean validType=false;
		boolean validFlavour=false;
		
		if(name!=null&&name.length()>=4&&name.length()<20) {
			System.out.println("Valied pizza name "+name);
			validName=true;
		}
		else {
			System.out.println("Invalie Pizza name"+name);
		}
		if(price>=50&&price<=1500) {
			System.out.println("Valied pizza price "+price);
			validPrice=true;
		}
		else {
			System.out.println("Invalie Pizza Price"+price);
		}
		if(company!=null&&company.length()<=4&&company.length()>=20) {
			System.out.println("Valied Company  "+company);
			validCompany=true;
		}
		else {
			System.out.println("Invalie Company"+company);
		}
		if(size!=null) {
			System.out.println("Valied pizza size "+size);
			validSize=true;
		}
		else {
			System.out.println("Invalie Pizza Size"+size);
		}
		if(flavour!=null&&flavour.length()<=4&&flavour.length()>20) {
			System.out.println("Valied Flavour "+flavour);
			validFlavour=true;
		}
		else {
			System.out.println("Invalie Flavour"+flavour);
		}
		if(type!=null&&type.length()<=VEG&&type.length()<=NONVEG) {
			System.out.println("Valied pizza type "+type);
			validType=true;
		}
		else {
			System.out.println("Invalie Pizza type"+type);
		}
		if(validName&&validPrice&&validCompany&&validSize&&validType&&validFlavour) {
			System.out.println("Pizza DTO is Valied  "+dto);
			return true;
		}
		System.out.println("Pizza is not valid"+dto);
		System.out.println(dto.toString());		
		return false;
	}

}
