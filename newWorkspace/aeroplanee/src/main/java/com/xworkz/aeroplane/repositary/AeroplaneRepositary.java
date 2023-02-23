package com.xworkz.aeroplane.repositary;

import com.xworkz.aeroplane.entity.AeroplaneEntity;

public interface AeroplaneRepositary {
	
	boolean save(AeroplaneEntity entity);


	default AeroplaneEntity findById(int id) {
		return null;
}
}