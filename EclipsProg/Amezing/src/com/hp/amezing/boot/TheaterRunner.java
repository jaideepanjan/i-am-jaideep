package com.hp.amezing.boot;

import java.time.LocalDateTime;

import com.hp.amezing.dto.TheaterDTO;
import com.hp.amezing.exceptions.InvalidTheaterDataException;
import com.hp.amezing.exceptions.SpaceOutOfBoundaryException;
import com.hp.amezing.repository.TheaterRepo;
import com.hp.amezing.repository.TheaterRepoImpl;
import com.hp.amezing.service.TheaterService;
import com.hp.amezing.service.TheaterServiceImpl;

public class TheaterRunner {

	public static void main(String[] args) {
		
		TheaterDTO dto=new TheaterDTO(null, null, null, null);
				dto.setCreatedBy("Jaideep");
		        dto.setCreatedDate(LocalDateTime.now());
		        dto.setUpdatedBy("Joy");
		        dto.setUpdatedDate(LocalDateTime.now());
		        
		        TheaterRepo repositary=new TheaterRepoImpl();
		        
		        TheaterService service = new TheaterServiceImpl(repositary);
		        
		        boolean saved;
		        
		        try {
					service.validateAndSave(dto);
				} catch (InvalidTheaterDataException e) {
					e.printStackTrace();
				}catch (SpaceOutOfBoundaryException e) {
					e.printStackTrace();

	}

}
}
