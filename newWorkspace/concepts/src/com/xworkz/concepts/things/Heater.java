package com.xworkz.concepts.things;

public class Heater {

	private String brand;
	private String coilType;
	private double price;
	// clone,getClass,finalie,toString,wait,notify,notifyAll,equals,hashCode,wait,wait

	public Heater() {
		System.out.println("no-arg const of Heater...");
	}

	public Heater(String brand, String coilType, double price) {
		this.brand = brand;
		this.coilType = coilType;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {// heater.equals(heater2)
		System.out.println("running equals in Heater :" + obj);
		if (obj != null)// true
		{
			System.out.println("Object is not null");
			if (obj instanceof Heater) {
				System.out.println("Obj is heater type, can compare");
				Heater casted = (Heater) obj;// access props of heater
				Heater heater = this;
				Heater heater2 = casted;
				if (heater.brand.equals(heater2.brand)
						&& heater.coilType.equals(heater2.coilType)
						&& heater.price == heater2.price) {
					System.out.println("Heater and heater2 is Same");
					return true;
				}
				else {
					System.out.println("heater and heater props are differnt");
				}

			} else {
				System.out.println("Obj is not heater, will not compare..");
			}
		} else {
			System.out.println("Object is null , cannot compare the data");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "[Brand : " + this.brand + "] [Coil Type : " + this.coilType + "] [Price : " + this.price + "]";
	}

}
