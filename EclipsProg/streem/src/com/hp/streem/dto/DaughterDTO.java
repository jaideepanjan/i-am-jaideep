package com.hp.streem.dto;

import java.io.Serializable;

public class DaughterDTO implements Serializable {
	
	private String name; 
	private long mobileNo;
	private int age;
	private boolean committed; 
	private boolean alive;
	
	public DaughterDTO() {
		// TODO Auto-generated constructor stub
	}

	public DaughterDTO(String name, long mobileNo, int age, boolean committed, boolean alive) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.age = age;
		this.committed = committed;
		this.alive = alive;
	}

	@Override
	public String toString() {
		return "DaughterDTO [name=" + name + ", mobileNo=" + mobileNo + ", age=" + age + ", committed=" + committed
				+ ", alive=" + alive + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof DaughterDTO)
			{
				DaughterDTO dto = (DaughterDTO)obj;
				dto.setAge(22);
				dto.setAlive(true);
				dto.setCommitted(false);
				dto.setMobileNo(7259646525L);
				dto.setName("Jeeva");
				System.out.println(dto.getAge());
				System.out.println(dto.getMobileNo());
				System.out.println(dto.getName());
				System.out.println(dto.isAlive());
				System.out.println(dto.isCommitted());
				System.out.println(dto);
				return true;
			}
		}
		return false;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCommitted() {
		return committed;
	}

	public void setCommitted(boolean committed) {
		this.committed = committed;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	

}
