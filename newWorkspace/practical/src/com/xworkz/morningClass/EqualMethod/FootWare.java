package com.xworkz.morningClass.EqualMethod;

public class FootWare {
	
	private String brand;
	private double size;
	private String type;
	
	public FootWare() {
		System.out.println("Running no arg cons in FootWare");
	}

	public FootWare(String brand, double size, String type) {
		super();
		this.brand = brand;
		this.size = size;
		this.type = type;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals method in Footware");
		
		if(obj!=null) {
			System.out.println("Object id not null");
			if(obj instanceof FootWare) {
				System.out.println("Obj is instance of FootWare can Compare");
				FootWare casted=(FootWare)obj;
				FootWare footWare=this;
				FootWare footWare2=casted;
				if(footWare.brand.endsWith(footWare2.brand)&&footWare.size==footWare2.size&&footWare.type.equals(footWare2.size)) {
					System.out.println("FootWare1 and Footware2 both are same");
				return true;
				}
				else{
					System.out.println("FootWare1 and Footware@ both are not Same");
				}
			}
			else {
				System.out.println("Obj is not instance of footware can't compare");
			}
		}
		else {
			System.out.println("Object is null");
		}
		
		
		
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "FootWare [brand=" + brand + ", size=" + size + ", type=" + type + "]";
	}
	
	

}
