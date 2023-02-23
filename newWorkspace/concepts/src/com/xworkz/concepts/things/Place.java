package com.xworkz.concepts.things;

public class Place {

	private String name;
	private double sqkms;

	public Place(String name, double sqkms) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.sqkms = sqkms;
	}

	@Override
	public boolean equals(Object arg) {
		System.out.println("running equals in Place " + arg);
		if (arg != null) {
			System.out.println("Arg is not null");
			if (arg instanceof Place) {
				System.out.println("Arg is place");
				Place casted = (Place) arg;
				Place left = this;
				Place right = casted;
				if (left.name.equals(right.name) && left.sqkms == right.sqkms) {
					System.out.println("Left is equals to right");
					return true;
				} else {
					System.err.println("Left is not equal to right");
				}
			} else {
				System.err.println("Arg is not place..");
			}
		} else {
			System.err.println("Arg is null");
		}

		return super.equals(arg);
	}

	@Override
	public String toString() {
		return "[Name : " + this.name + "][ Sq kms :" + this.sqkms+"]";
	}

}
