package com.hp.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.hp.collections.dto.SanitizerDTO;

public class SanitizerRunner {

	public static void main(String[] args) {
		SanitizerDTO sanitizerDTO0=new SanitizerDTO("AJ158", "Amul", "India", 150D);
		SanitizerDTO sanitizerDTO1=new SanitizerDTO("AJ468", "Amul", "Shree Lanka", 65D);
		SanitizerDTO sanitizerDTO2=new SanitizerDTO("AJ257", "Amul", "Amerika", 230D);
		SanitizerDTO sanitizerDTO3=new SanitizerDTO("AJ358", "Amul", "Naiziland", 250D);
		SanitizerDTO sanitizerDTO4=new SanitizerDTO("AJ456", "Amul", "Yurop", 450D);
		SanitizerDTO sanitizerDTO5=new SanitizerDTO("AJ458", "Amul", "England", 100D);
		SanitizerDTO sanitizerDTO6=new SanitizerDTO("AJ423", "Amul", "Rashya", 480D);
		SanitizerDTO sanitizerDTO7=new SanitizerDTO("AJ451", "Amul", "Austria", 540D);
		SanitizerDTO sanitizerDTO8=new SanitizerDTO("AJ651", "Amul", "Canada", 600D);
		SanitizerDTO sanitizerDTO9=new SanitizerDTO("AJ345", "Amul", "France", 1240D);
		

        Collection<SanitizerDTO> collection=new ArrayList<SanitizerDTO>();
        
        collection.add(sanitizerDTO0);
        collection.add(sanitizerDTO1);
        collection.add(sanitizerDTO2);
        collection.add(sanitizerDTO3);
        collection.add(sanitizerDTO4);
        collection.add(sanitizerDTO5);
        collection.add(sanitizerDTO6);
        collection.add(sanitizerDTO7);
        collection.add(sanitizerDTO8);
        collection.add(sanitizerDTO9);
        
        Iterator<SanitizerDTO> ref1=collection.iterator();
        while(ref1.hasNext()) {
        	SanitizerDTO element=ref1.next();
        	if(element.getPrice()>50) {
        		System.out.println("Sanitizsers of price 50 or above "+element);
        	}
        }
        
        Iterator<SanitizerDTO> ref2=collection.iterator();
        while(ref2.hasNext()) {
        	SanitizerDTO element2=ref2.next();
        	if(element2!= null) {
        		System.out.println("No element is null "+element2);
        	}
        }
        
        Iterator<SanitizerDTO> ref3=collection.iterator();
        while(ref3.hasNext()) {
        	SanitizerDTO element3=ref3.next();
        	if(element3.getProducedBy().matches("Amul")) {
        		ref3.remove();
        		System.out.println("Removed elements "+element3);
        	}
        }
        
        Iterator<SanitizerDTO> ref4=collection.iterator();
        while(ref4.hasNext()) {
        	SanitizerDTO element4=ref4.next();
        	if(element4.getPrice()<100) {
        		System.out.println("Shortest priced sanitizer "+element4);
        	}
        }
        
        Iterator<SanitizerDTO> ref5=collection.iterator();
        while(ref5.hasNext()) {
        	SanitizerDTO element5=ref1.next();
        	if(element5.getPrice()>500) {
        		System.out.println("Maximum price sanitizer "+element5);
        	}
        }
        
        Iterator<SanitizerDTO> ref6=collection.iterator();
        while(ref6.hasNext()) {
        	SanitizerDTO element6=ref1.next();
        	if(element6.getPrice()>1000) {
        		System.out.println("2nd Maximum Price sanitizer "+element6);
        	}
        }
        
	
	}

}
