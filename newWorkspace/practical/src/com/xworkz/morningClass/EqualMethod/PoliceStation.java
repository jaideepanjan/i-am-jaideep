package com.xworkz.morningClass.EqualMethod;

public class PoliceStation {

	private String name;
	private String location;
	private String headName;
	private String viseHeadName;
	private int noOfConstebals;
	private int noOfLadyConstable;
	private int noOfMenConstable;
	private int noOfTeaf;
	private String buildingtype;
	private boolean secured;
	
	public PoliceStation() {
		System.out.println("Running no arg cons in PoliceStation");
	}

	public PoliceStation(String name, String location, String headName, String viseHeadName, int noOfConstebals,
			int noOfLadyConstable, int noOfMenConstable, int noOfTeaf, String buildingtype, boolean secured) {

		this.name = name;
		this.location = location;
		this.headName = headName;
		this.viseHeadName = viseHeadName;
		this.noOfConstebals = noOfConstebals;
		this.noOfLadyConstable = noOfLadyConstable;
		this.noOfMenConstable = noOfMenConstable;
		this.noOfTeaf = noOfTeaf;
		this.buildingtype = buildingtype;
		this.secured = secured;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals in PoliceStation");
		if(obj!=null) {
			System.out.println("Object is not null");
			if(obj instanceof PoliceStation) {
				System.out.println("Obj is instance of PoliceStation can compare");
				PoliceStation casted=(PoliceStation)obj;
				PoliceStation policeStation=this;
				PoliceStation policeStation2=casted;
				if(policeStation.name.equals(policeStation2.name)&&policeStation.location.equals(policeStation2.location)&&policeStation.headName.equals(policeStation2.headName)&&policeStation.viseHeadName.equals(policeStation2.viseHeadName)&&policeStation.noOfConstebals==policeStation2.noOfConstebals&&policeStation.noOfLadyConstable==policeStation2.noOfMenConstable&&policeStation.noOfTeaf==policeStation2.noOfTeaf&&policeStation.buildingtype.equals(policeStation2.buildingtype)&&policeStation.secured==policeStation2.secured) {
					System.out.println("Polistation1 and polistation 2 both are same");
					return true;
				}
				else {
					System.out.println("Polistation1 and polistation 2 both are not same");
				}
			}
			else {
				System.out.println("Obj is not instance of PoliceStation can't compare");
			}
		}
		else {
			System.out.println("Object is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "PoliceStation [name=" + name + ", location=" + location + ", headName=" + headName + ", viseHeadName="
				+ viseHeadName + ", noOfConstebals=" + noOfConstebals + ", noOfLadyConstable=" + noOfLadyConstable
				+ ", noOfMenConstable=" + noOfMenConstable + ", noOfTeaf=" + noOfTeaf + ", buildingtype=" + buildingtype
				+ ", secured=" + secured + "]";
	}

}
