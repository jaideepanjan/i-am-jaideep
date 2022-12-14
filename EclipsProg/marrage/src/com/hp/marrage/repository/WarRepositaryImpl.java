package com.hp.marrage.repository;

import java.time.LocalDateTime;

import com.hp.marrage.dto.WarDTO;
import com.hp.marrage.exception.WarSizeExcededException;

public class WarRepositaryImpl implements WarRepositary {
	
	private WarDTO[] wars=new WarDTO[10];
	private int warIndex=0;

	@Override
	public boolean fightWar(WarDTO warDTO) {
	System.out.println("Running the fighting war");
	if(this.warIndex>=wars.length) {
	throw new WarSizeExcededException();	
	}
	System.out.println("saved to" +warDTO +"at index" +warIndex);
	this.wars[warIndex]=warDTO;
	warIndex++;
	return true;
	}

	@Override
	public boolean fightwar(WarDTO warDTO) {
				return false;
	}

	

	@Override
	public WarDTO findByStartedByAndStartedWith(String startedBy, String startedWith) {
		System.out.println("Running findByStartedByAndStartedWith" +startedBy +startedWith);
		for(WarDTO dto : wars) {
			if(dto!=null && dto.getStartedBy().equalsIgnoreCase(startedBy)&&dto.getStartedWith().equalsIgnoreCase(startedWith)) {
				System.out.println("War dto in find is exist" +startedBy +startedWith);
			}
		}
		System.out.println("DTO is not found");
		return WarRepositary.super.findByStartedByAndStartedWith(startedBy, startedWith);
	}

	@Override
	public WarDTO findByStartedDateGreaterThanOrEqualTo(LocalDateTime startedIn) {
		System.out.println("Running the findByStartedDateLesserThanOrEqualTo"+startedIn);
		for(WarDTO dto : wars) {
			if(dto!=null && dto.getStartedin().isBefore(startedIn)) {
				System.out.println("dto is found"+startedIn);
			}
		}
		System.out.println("DTO is not found and it is greater or lesser than given date");
		return WarRepositary.super.findByStartedDateGreaterThanOrEqualTo(startedIn);
	}

	@Override
	public WarDTO findByStartDateAndEndDate(LocalDateTime startedIn,LocalDateTime endedIn) {
		// TODO Auto-generated method stub
		return WarRepositary.super.findByStartDateAndEndDate(startedBy, startedWith);
	}
	@Override
	public int total() {
		System.out.println("Running the Total String Method");
		return WarRepositary.super.total();
	}
	

}
