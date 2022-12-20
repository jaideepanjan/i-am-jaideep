package com.hp.amezing.service;

import com.hp.amezing.dto.PlaceDTO;
import com.hp.amezing.exceptions.InvalidPlaceDataException;
import com.hp.amezing.exceptions.SpaceOutOfBoundaryException;
import com.hp.amezing.repository.PlaceRepo;

public class PlaceServiceImpl implements PlaceService {
	
	private PlaceRepo repositary;
	
	
	public PlaceServiceImpl(PlaceRepo repositary) {
		super();
		this.repositary = repositary;
	}
	
	@Override
	public boolean validateAndSave(PlaceDTO dto) throws InvalidPlaceDataException, SpaceOutOfBoundaryException {
		boolean name = false;
		boolean region=false;
		boolean area=false;
		boolean childrensAllowed=false;
		boolean famousFor=false;
		
		if(dto.getName()!=null&&dto.getName().length()>=4&&dto.getName().length()<=20) {
			System.out.println("Valid Name "+dto.getName());
			System.out.println(dto);
			name=true;
		}
		else {
			throw new InvalidPlaceDataException();
		}
		if(dto.getRegion()!=null&&dto.getRegion().length()>=4&&dto.getRegion().length()<=20) {
			System.out.println("Valid Region "+dto.getRegion());
			System.out.println(dto);
			region=true;
		}
		else {
			throw new InvalidPlaceDataException();
		}
		if(dto.getArea()!=0&&dto.getArea()>0) {
			System.out.println("Valid area "+dto.getArea());
			System.out.println(dto);
			area=true;
		}
		else {
			throw new InvalidPlaceDataException();
		}
		if(dto.isChildrensAllowed()!=false) {
			System.out.println("Valid childrens Allowed "+dto.isChildrensAllowed());
			System.out.println(dto);
			childrensAllowed=true;
		}
		else {
			throw new InvalidPlaceDataException();
		}
		if(dto.getFamousFor()!=null&&dto.getFamousFor().length()>=4&&dto.getFamousFor().length()<=20) {
			System.out.println("Valid Famous for "+dto.getFamousFor());
			System.out.println(dto);
			famousFor=true;
		}
		else {
			throw new InvalidPlaceDataException();
		}
		if(name&&region&&area&&childrensAllowed&&famousFor) {
			System.out.println("Propertyes Valid can save in Repositary "+dto.getName());
			System.out.println(dto);
			return true;
		}
		
		
		
		
		return false;
	}

	

}
