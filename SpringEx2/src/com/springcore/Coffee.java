package com.springcore;


public class Coffee implements IHotDrink{
	
	@Override
	public void prepareHotDrink() {
		System.out.println("preparing coffee!");
	}
}
