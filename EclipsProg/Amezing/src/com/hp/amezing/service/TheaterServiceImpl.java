package com.hp.amezing.service;

import org.omg.CORBA.IDLType;

import com.hp.amezing.dto.TheaterDTO;
import com.hp.amezing.exceptions.InvalidTheaterDataException;
import com.hp.amezing.exceptions.SpaceOutOfBoundaryException;
import com.hp.amezing.repository.TheaterRepo;

public class TheaterServiceImpl implements TheaterService {
	
	private TheaterRepo repositary;
	
	

	public TheaterServiceImpl(TheaterRepo repositary) {
		super();
		this.repositary = repositary;
	}



	@Override
	public boolean validateAndSave(TheaterDTO dto) throws InvalidTheaterDataException, SpaceOutOfBoundaryException {
		boolean  id=false;
		boolean name=false;
		boolean brand=false;
		boolean seats=false;
		
		if(dto.getId()!=0&&dto.getId()>0) {
			System.out.println("its valid ID "+dto.getId());
			System.out.println(dto);
			id=true;
		}
		else {
			System.out.println("Custem exception is started");
			throw new InvalidTheaterDataException();
		}
		if(dto.getName()!=null&&dto.getName().length()>=4&&dto.getName().length()<=20) {
			System.out.println("its valid Nmae "+dto.getName());
			System.out.println(dto);
			name=true;
		}
		else {
			System.out.println("Custem exception is started");
			throw new InvalidTheaterDataException();
		}
		if(dto.getBrand()!=null&&dto.getBrand().length()>4&&dto.getBrand().length()<20) {
			System.out.println("its valid Brand "+dto.getBrand());
			System.out.println(dto);
			brand=true;
		}
		else {
			System.out.println("Custem exception is started");
			throw new InvalidTheaterDataException();
		}
		if(dto.getSeats()!=0&&dto.getSeats()>0&&dto.getSeats()<=400) {
			System.out.println("its valid Seat number "+dto.getSeats());
			System.out.println(dto);
			seats=true;
		}
		else {
			System.out.println("Custem exception is started");
			throw new InvalidTheaterDataException();
		}
		if(id&&name&&brand&&seats) {
			System.out.println("Datas are valied can store in repositary ");
			boolean saved=this.repositary.saving(dto);
			System.out.println(dto);
			return true;
		}		
		return false;
	}

}
