package com.xworkz.jet.service;

import java.util.List;

import com.xworkz.jet.dto.JetDTO;
import com.xworkz.jet.exception.InvalidJetDataException;
import com.xworkz.jet.repositary.JetRepositary;
import com.xworkz.jet.utils.JetUtil;

public class JetSrviceImpl implements JetService {

	public JetSrviceImpl(JetRepositary repo) {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	private JetRepositary repositary;

	@Override
	public boolean validateAndSave(JetDTO dto) throws InvalidJetDataException {
		System.out.println("Running validate and save in service ");

		if (dto != null) {

			System.out.println("DTO is not null");

			String name = dto.getName();
			double weight = dto.getWeight();
			String colour = dto.getColour();
			int noOfSeats = dto.getNoOfSeats();
			float gravity = dto.getGravity();

			boolean validName = false;
			boolean validWeight = false;
			boolean validColour = false;
			boolean validNoOfSeats = false;
			boolean validgravity = false;

			if (JetUtil.validString(name)) {
				System.out.println("valid Name");
				validName = true;
			} else {
				System.out.println("Name invalid");
			}

			if (JetUtil.validDouble(weight)) {
				System.out.println("valid Waight");
				validWeight = true;
			} else {
				System.out.println("Waight is invalid");
			}

			if (JetUtil.validString(colour)) {
				System.out.println("valid colour");
				validColour = true;
			} else {
				System.out.println("colour is invalid");
			}

			if (JetUtil.validInt(noOfSeats)) {
				System.out.println("valid noOfSeats");
				validNoOfSeats = true;
			} else {
				System.out.println("noOfSeats are invalid");
			}

			if (JetUtil.validFloat(gravity)) {
				System.out.println("valid gravity");
				validgravity = true;
			} else {
				System.out.println("gravity is invalid");
			}

			if (JetUtil.validAll(validName && validWeight && validColour && validNoOfSeats && validgravity)) {
				System.out.println("Validation is done can save the data");
				// boolean exists = this.repositary.isExist(dto);

				boolean saved = this.repositary.save(dto);
				System.out.println("DTO is saved : " + saved);
				return saved;

			} else {
				throw new InvalidJetDataException("Invalid data");
			}
		}

		else {
			System.out.println("Dto is null");
		}
		return false;

	}

}
