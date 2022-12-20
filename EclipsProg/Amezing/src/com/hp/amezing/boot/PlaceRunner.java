package com.hp.amezing.boot;

import java.time.LocalDateTime;

import com.hp.amezing.dto.PlaceDTO;
import com.hp.amezing.exceptions.InvalidPlaceDataException;
import com.hp.amezing.exceptions.SpaceOutOfBoundaryException;
import com.hp.amezing.repository.PlaceRepo;
import com.hp.amezing.repository.PlaceRepoImpl;
import com.hp.amezing.service.PlaceService;
import com.hp.amezing.service.PlaceServiceImpl;


public class PlaceRunner {

	public static void main(String[] args) {
		
		PlaceDTO dto=new PlaceDTO("Mullayyana Giri", "Forest", 0, false, "Trucking");
		
		PlaceRepo repository=new PlaceRepoImpl();
		
		PlaceService service =new PlaceServiceImpl(repository);
		
		dto.setCreatedBy("Hamsa");
		dto.setCreatedDate(LocalDateTime.now());
		dto.setUpdatedBy("Yashortha");
		dto.setUpdatedDate(LocalDateTime.now());
		
		try {
			service.validateAndSave(dto);
		} catch (InvalidPlaceDataException e) {
			e.printStackTrace();
		}catch(SpaceOutOfBoundaryException e) {
		    e.printStackTrace();
		}
	}

}
