package org.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springcore.Address;

@Component
public class Teacher {
	@Autowired
	private Address thAddress;

	public Address getThAddress() {
		return thAddress;
	}

	


}
