package com.hp.amezing.service;

import com.hp.amezing.constant.Type;
import com.hp.amezing.dto.BuildingDTO;
import com.hp.amezing.exceptions.InvalidBuildingDataException;
import com.hp.amezing.repository.BuildingRepo;

public class BuildingServiceImp implements BuildingService {
	
	private BuildingRepo repositary;
	

	public BuildingServiceImp(BuildingRepo repositary) {
		this.repositary = repositary;
	}

	@Override
	public boolean validateSaved(BuildingDTO dto) throws InvalidBuildingDataException {
		System.out.println("Running validate and save"+dto);
		int number=dto.getNumber();
		String name=dto.getName();
		byte floors=dto.getFloors();
		boolean lift=dto.isLift();
		char parkingSlotes=dto.getParkingSlotes();
		Type type=dto.getType();
		
		boolean validNumber=false;
		boolean validName=false;
		boolean validFloors=false;
		boolean validLift=false;
		boolean validParkingSlotes=false;
		boolean validType=false;
		
		if(number!=0 && number>=4 && number<=5000) {
			System.out.println("valid number"+number);
			validNumber=true;
		}
		else {
			throw new InvalidBuildingDataException ("Invalid number"+number);
		}
		if(name!=null && name.length()>=4 && name.length()<=20) {
			System.out.println("valid Name"+name);
			validName=true;
		}
		else {
			throw new InvalidBuildingDataException("Invalid Name"+number);
		}
		if(floors!=0 && floors>=0 && floors<=250){
			System.out.println("valid Floors "+floors);
			validFloors=true;
		}
		else {
			throw new InvalidBuildingDataException("Invalid Floors"+floors);
		}
		if(lift!=false ) {
			System.out.println("valid lift data"+lift);
			validLift=true;
		}
		else {
			throw new InvalidBuildingDataException("Invalid lift data"+lift);
		}
		if(parkingSlotes!=0 ) {
			System.out.println("valid number"+parkingSlotes);
			validParkingSlotes=true;
		}
		else {
			throw new InvalidBuildingDataException("Invalid Parking Slotes"+parkingSlotes);
		}
		if(type!=null ) {
			System.out.println("valid Type"+type);
			validType=true;
		}
		else {
			throw new InvalidBuildingDataException("Invalid Parking Slotes"+type);
		}
		if(number&&name&&floors&&lift&&parkingSlotes&&type) {
			System.out.println("Data of Building is validated can save to repositary");
			boolean saved=this.repositary.ground(dto);
			return true;
		}
		
			
		
		return false;
	}

}
