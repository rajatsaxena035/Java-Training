package org.springcore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")

@Component
public class Address {
	private String city="var";

	public Address() {
		
		System.out.println(city);
	}

	public String getCity() {
		return city;
	}
	
}
