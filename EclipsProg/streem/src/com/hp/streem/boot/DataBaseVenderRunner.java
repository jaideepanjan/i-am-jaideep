package com.hp.streem.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.hp.streem.constants.Type;
import com.hp.streem.dto.DataBaseVenderDTO;

public class DataBaseVenderRunner {

	public static void main(String[] args) {
		
		
		Collection<DataBaseVenderDTO> dto =new ArrayList<DataBaseVenderDTO>();
		
		dto.add(new DataBaseVenderDTO("SAP","SAP",Type.SAP,565,47));
		dto.add(new DataBaseVenderDTO("Oracle RDBMS","Oracle",Type.ORACLE,500,12));
		dto.add(new DataBaseVenderDTO("MicroSoft  Server","Microsoft pvt ltd",Type.MICROSOFT,500,40));
		dto.add(new DataBaseVenderDTO("IBM DB2","Microsoft pvt ltd",Type.IBM,500,400));
		
		
		dto.stream().filter(ele->ele.getLicenseCost()<100 || ele.getType().equals("ORACLE")).map(ele->ele.getDevlopedBy().toUpperCase()).forEach(dto1->System.out.println(dto1));
		
		System.out.println(System.lineSeparator());
		System.out.println("======================================");
		
		dto.stream().forEach(ele->System.out.println(ele));
		
		System.out.println(System.lineSeparator());
		System.out.println("======================================");
		
		dto.stream().forEach(ele->System.out.println("Types of the Data Base Vendor:"+" "+ele.getType()));
		
	

	}

}
