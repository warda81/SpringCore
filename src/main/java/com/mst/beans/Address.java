package com.mst.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("New York")
	private String city;
	
	@Value("bla bla")
	private String state;
	
	@Value("USA")
	private String country;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void showAddress() {
		// TODO Auto-generated method stub
	System.out.println("Address [city="+city+" ,state="+state+ " ,country="+ country+']');
		
	}

}
