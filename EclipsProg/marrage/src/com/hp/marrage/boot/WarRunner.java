package com.hp.marrage.boot;

import java.time.LocalDateTime;

import com.hp.marrage.dto.WarDTO;
import com.hp.marrage.repository.WarRepositary;
import com.hp.marrage.repository.WarRepositaryImpl;

public class WarRunner {

	public static void main(String[] args) {
		WarRepositary repositary =new WarRepositaryImpl();
		WarDTO war1 = new WarDTO("First World war", "Jaideep and Jeevan", "Anjan", LocalDateTime.of(1999, 2,31,9,26), LocalDateTime.of(2006, 7,24,10,17), "Goruru", 0)
        repositary.fightwar(war1);
		System.out.println(repositary.total());
		WarDTO dto =repositary.findByStartedBy("Jaideep and jeevan");
		System.out.println(dto);
		System.out.println("------------------------------");
		WarDTO dto1 =repositary.findByStartedByAndStartedWith("Jaideep and jeevan", "Anjan");
		System.out.println(dto1);
		System.out.println("---------------------------------");
		WarDTO dto2=repositary.findByStartedDateGreaterThanOrEqualTo(LocalDateTime.of(1999, 2,31,9,26));
		System.out.println(dto2);
		System.out.println("---------------------------------");
		WarDTO dto3=repositary.findStartedDateLesserThanOrEqualto(LocalDateTime.of(2006, 7,24,10,17));
		System.out.println(dto3);
		System.out.println("---------------------------------");
        WarDTO dto4=repositary.findByStartDateAndEndDate(LocalDateTime.of(1999, 2,31,9,26), LocalDateTime.of(2006, 7,24,10,17))	
	    System.out.println(dto4);
	}

}
