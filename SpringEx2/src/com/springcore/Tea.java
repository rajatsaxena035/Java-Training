package com.springcore;

public class Tea implements IHotDrink{
	
	@Override
	public void prepareHotDrink() {
		System.out.println("preparing tea!");
	}
}
