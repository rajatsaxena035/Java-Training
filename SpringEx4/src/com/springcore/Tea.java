package com.springcore;

public class Tea implements IHotDrink{
	
	public Tea()
	{
		System.out.println("default constructor!");
	}
	
	@Override
	public void prepareHotDrink() {
		System.out.println("preparing tea!");
	}
}
