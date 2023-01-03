package com.hp.streem.boot;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.hp.streem.dto.CompanyCEODTO;
import com.hp.streem.dto.DaughterDTO;

public class CompanyCEORunner {

	public static void main(String[] args) {


		DaughterDTO ref=new DaughterDTO("Yashortha", 6598741235l, 22, false, true);
		DaughterDTO ref1=new DaughterDTO("Deeksha", 6598741564l, 18, true, true);
		DaughterDTO ref2=new DaughterDTO("Tejaswini", 6598426835l, 16, false, true);
		DaughterDTO ref3=new DaughterDTO("Dumbita", 6596572357l, 20, true, true);
		
		
		Collection<CompanyCEODTO> dto=new LinkedList<CompanyCEODTO>();
		
		dto.add(new CompanyCEODTO("Vijay Kumar", "Vijay Home Products", 35, "India", "B Com", true, ref));
		dto.add(new CompanyCEODTO("Mohan", "Deeksha Agencyes", 38, "India", "ITI", true, ref1));
		dto.add(new CompanyCEODTO("Umesh", "Hoel", 43, "India", "PUC", true, ref2));
		dto.add(new CompanyCEODTO("Lokesh", "Lokesh Finance", 36, "India", "B Sc", true, ref3));

		
dto.stream().collect(Collectors.toSet()).forEach(ele->System.out.println(ele));
		
		System.out.println(System.lineSeparator());
		dto.stream().map(ele->ele.getDto().getName()).collect(Collectors.toSet()).forEach(ele->System.out.println(ele));
		System.out.println(System.lineSeparator());
		dto.stream().filter(ele->ele.getAge()>30).collect(Collectors.toSet()).forEach(ele->System.out.println(ele));
		System.out.println(System.lineSeparator());
		dto.stream().forEach(ele->System.out.println("Father age:"+ele.getAge()+"Daughter age:"+ele.getDaughterDTO().getAge()));
		
		
	}

	}

