package com.xworkz.validation.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class AmbulanceDTO implements Serializable, Comparable<AmbulanceDTO> {

	@NotEmpty
	@Max(value = 1000)
	@Min(value = 1)
	private int id;
	
	@NotEmpty
	@Min(value= 0001)
	@Max(value = 9999)
	private short regNo;
	@Size(min=17,max=17)
	private String chassisNumber;
	@Size(min=3,max=20)
	private String ownerName;
	@NotEmpty
	private boolean insuranceExpired;
	@Size(min=3,max=20)
	private String driverName;
	
	private LocalDate taxSrartDate;

	public AmbulanceDTO() {
		System.out.println("Running default constructer in AmbulanceDTO");
	}

	@Override
	public int hashCode() {
		return Objects.hash(chassisNumber, driverName, id, insuranceExpired, ownerName, regNo, taxSrartDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AmbulanceDTO other = (AmbulanceDTO) obj;
		return Objects.equals(chassisNumber, other.chassisNumber) && Objects.equals(driverName, other.driverName)
				&& id == other.id && insuranceExpired == other.insuranceExpired
				&& Objects.equals(ownerName, other.ownerName) && regNo == other.regNo
				&& Objects.equals(taxSrartDate, other.taxSrartDate);
	}

	@Override
	public String toString() {
		return "AmbulanceDTO [id=" + id + ", regNo=" + regNo + ", chassisNumber=" + chassisNumber + ", ownerName="
				+ ownerName + ", insuranceExpired=" + insuranceExpired + ", driverName=" + driverName
				+ ", taxSrartDate=" + taxSrartDate + "]";
	}

	public AmbulanceDTO(@NotEmpty @Max(1000) @Min(1) int id, short regNo, String chassisNumber, String ownerName,
			boolean insuranceExpired, String driverName, LocalDate taxSrartDate) {
		super();
		this.id = id;
		this.regNo = regNo;
		this.chassisNumber = chassisNumber;
		this.ownerName = ownerName;
		this.insuranceExpired = insuranceExpired;
		this.driverName = driverName;
		this.taxSrartDate = taxSrartDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public short getRegNo() {
		return regNo;
	}

	public void setRegNo(short regNo) {
		this.regNo = regNo;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public boolean isInsuranceExpired() {
		return insuranceExpired;
	}

	public void setInsuranceExpired(boolean insuranceExpired) {
		this.insuranceExpired = insuranceExpired;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public LocalDate getTaxSrartDate() {
		return taxSrartDate;
	}

	public void setTaxSrartDate(LocalDate taxSrartDate) {
		this.taxSrartDate = taxSrartDate;
	}

	@Override
	public int compareTo(AmbulanceDTO o) {
		System.out.println("Running compare to method");
		if (this.ownerName != null) {
			return this.getDriverName().compareTo(o.getOwnerName());
		}
		return 0;
	}

}
