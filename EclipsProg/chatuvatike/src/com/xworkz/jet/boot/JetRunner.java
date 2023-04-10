package com.xworkz.jet.boot;

import com.xworkz.jet.dto.JetDTO;
import com.xworkz.jet.exception.InvalidJetDataException;
import com.xworkz.jet.repositary.JetRepositary;
import com.xworkz.jet.repositary.JetRepositaryImpl;
import com.xworkz.jet.service.JetService;
import com.xworkz.jet.service.JetSrviceImpl;

public class JetRunner {

	public static void main(String[] args) {

		JetDTO jet = new JetDTO("APJA", 4654.23, "Black", 6, 1.5f);

		JetRepositary repo = new JetRepositaryImpl();
		JetService service = new JetSrviceImpl(repo);

		try {
			boolean saved = service.validateAndSave(jet);
			System.out.println(saved);
		} catch (InvalidJetDataException e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}

	}

}
