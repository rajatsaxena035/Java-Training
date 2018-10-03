package com.springcore;

public class Address {
	private String city;

	public Address(String city) {
		
		this.city = city;
		System.out.println(city);
	}

	public String getCity() {
		return city;
	}
	
}
