package com.mst.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employeeBean")
public class Employee {
	
	@Value("Alex")
	private String emplName;
	@Value("12345")
	private int emplID;
	@Autowired //soft dependency
	private Address address;
	
	
/*	public Employee() { >> Hard dependency
		new Address(); //the old way to solve dependency
	}*/
	
	public String getEmplName() {
		return emplName;
	}
	public void setEmplName(String emplName) {
		this.emplName = emplName;
	}
	public int getEmplID() {
		return emplID;
	}
	public void setEmplID(int emplID) {
		this.emplID = emplID;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void showDetails() {
		System.out.println("ID="+emplID+" ,Name="+emplName);
		address.showAddress();
	}
}
