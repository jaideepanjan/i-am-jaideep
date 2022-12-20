package com.hp.amezing.boot;

import java.time.LocalDateTime;

import com.hp.amezing.dto.BuildingDTO;
import com.hp.amezing.exceptions.InvalidBuildingDataException;
import com.hp.amezing.repository.BuildingRepo;
import com.hp.amezing.repository.BuildingRepoImp;
import com.hp.amezing.service.BuildingService;

public class BuildingRunning {

	public static void main(String[] args) {
		
		
		BuildingDTO dto=new BuildingDTO('250', "SMMS", '25', true, A, "RECIDENTIAL");
		BuildingRepo repositary=new BuildingRepoImp();
		
		BuildingService service=new  BuildingServiceImp(repositary);
		
		dto.setCreatedBy("Jaideep");
		dto.setCreatedDate(LocalDateTime.now());
		dto.setUpdatedBy("Puttaswamy");
		dto.setUpdatedDate(LocalDateTime.now());
		
		try {
			service.validateSaved(dto);
		}catch(InvalidBuildingDataException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Execut all data");
		}

	}

}
