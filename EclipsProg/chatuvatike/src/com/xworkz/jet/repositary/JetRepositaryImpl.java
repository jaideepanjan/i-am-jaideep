package com.xworkz.jet.repositary;

import com.xworkz.jet.dto.JetDTO;
import com.xworkz.jet.exception.JetMemoryFullException;

public class JetRepositaryImpl implements JetRepositary {

	public JetRepositaryImpl() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	private JetDTO[] cDTO = new JetDTO[4];
	private int index = 0;

	@Override
	public boolean save(JetDTO dto) {
		System.out.println("Running save in repo");

		if (this.index < this.cDTO.length) {
			this.cDTO[index] = dto;
			this.index++;
			System.out.println("Dto at index " + index + " " + dto);
			return true;
		}
		return false;

	}

	@Override
	public boolean isExist(JetDTO dto) {
		if (cDTO != null && this.index == 0) {
			System.out.println("First element will not be checked");
			return false;
		} else {
			System.out.println("first element onward");
			for (int index = 0; index < this.cDTO.length; index++) {
				JetDTO ele = this.cDTO[index];
				if (ele.equals(dto)) {
					return true;
				}
			}
		}
		return false;
	}

}
