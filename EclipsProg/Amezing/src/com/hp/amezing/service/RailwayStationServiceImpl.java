package com.hp.amezing.service;

import com.hp.amezing.dto.RailwayStationDTO;
import com.hp.amezing.exceptions.InvalidRailwayStationDataException;
import com.hp.amezing.exceptions.SpaceOutOfBoundaryException;
import com.hp.amezing.repository.RailwayStationRepo;

public class RailwayStationServiceImpl implements RailwayStationService {
	
	private RailwayStationRepo repositary;
	
	
	
	

	public RailwayStationServiceImpl(RailwayStationRepo repositary) {
		super();
		this.repositary = repositary;
	}





	@Override
	public boolean validateAndSave(RailwayStationDTO dto)
			throws InvalidRailwayStationDataException, SpaceOutOfBoundaryException {


		boolean name=false;
		boolean noOfPlatform=false;
		boolean area=false;
		boolean platForTicketPrice=false;
		
		if(dto.getName()!=null&&dto.getName().length()>=4&&dto.getName().length()<=20) {
			System.out.println("valid name :"+dto.getName());
			System.out.println(dto);
			name = true;
		}
		else {
			throw new InvalidRailwayStationDataException();
		}
		
		if(dto.getNoOfPlatform()!=0&&dto.getNoOfPlatform()>=0&&dto.getNoOfPlatform()<=10) {
			System.out.println("valid PlatformNumber :"+dto.getNoOfPlatform());
			System.out.println(dto);
			noOfPlatform = true;
		}
		else {
			throw new InvalidRailwayStationDataException();
		}
		
		if(dto.getArea()!=null&&dto.getArea().length()>=4&&dto.getArea().length()<=20) {
			System.out.println("valid Area :"+dto.getArea());
			System.out.println(dto);
			area = true;
		}
		else {
			throw new InvalidRailwayStationDataException();
		}
		
		if(dto.getPlatForTicketPrice()!=0&&dto.getPlatForTicketPrice()>0&&dto.getPlatForTicketPrice()<=20) {
			System.out.println("valid Platfarm ticket price :"+dto.getPlatForTicketPrice());
			System.out.println(dto);
			platForTicketPrice = true;
		}
		else {
			throw new InvalidRailwayStationDataException();
		}
		
		if(name&&noOfPlatform&&area&&platForTicketPrice) {
			System.out.println("valid data ");
			System.out.println(dto);
			return true;
		}
		
		
		
		return false;
	}
	
	

}
