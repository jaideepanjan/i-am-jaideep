package com.xworkz.soldier.boot;

import com.xworkz.soldier.dao.SoldierDAO;
import com.xworkz.soldier.dao.SoldierDAOImpl;
import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.services.SoldierServiceImp;

public class SodierRunner {

	public static void main(String[] args) {
		
		SoldierDTO dto=new SoldierDTO("Jagadeesh Allagi", "India", 777, 1, "IVAR", 500);

		
		SoldierServiceImp service=new SoldierServiceImp();
		SoldierDAO dao=new SoldierDAOImpl();
		service.setSoldierDAO(dao);
		service.validateAndSave(dto);
	}

}
