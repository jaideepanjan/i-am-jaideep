package com.hp.marrage.repository;

import java.time.LocalDateTime;
import java.time.LocalTime;

import com.hp.marrage.dto.WarDTO;

public interface WarRepositary {
	
	boolean fightWar(WarDTO warDto);
	boolean fightwar(WarDTO warDTO);
	
	default int total() {
		return 0;
	}
	default WarDTO findByStartedBy(String startedBy) {
		return null;
	}
	default WarDTO findByStartedByAndStartedWith(String startedBy, String startedWith) {
		return null;
		
	}
	default WarDTO findByStartedDateGreaterThanOrEqualTo(LocalDateTime startedIn) {
		return null;
		
	}
	default WarDTO findStartedDateLesserThanOrEqualto(LocalDateTime localDateTime) {
		return null;
	}
	default WarDTO findByStartDateAndEndDate(LocalTime startedIn, LocalTime endedIn) {
		return null;
		
	}
	
}
