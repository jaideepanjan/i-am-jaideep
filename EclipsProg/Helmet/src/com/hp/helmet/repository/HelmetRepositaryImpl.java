package com.hp.helmet.repository;

import com.hp.helmet.dto.HelmetDTO;
import com.hp.helmet.exception.SizeOfArrayIsFull;

public class HelmetRepositaryImpl implements HelmetRepositary {
      
	
	private HelmetDTO[] helmet=new HelmetDTO[10];
	int index=0;
	
	
	@Override
	public boolean saved(HelmetDTO dto) {
		if(this.index>=this.helmet.length) {
			System.out.println("Exception is started");
			throw new SizeOfArrayIsFull(); 
		}
		this.helmet[index]=dto;
			System.out.println("Saved : "+dto+"index "+this.index);
			index++;
		return false;
	}
	
	
}
