package com.springcore;

public class Restaurant
{
	IHotDrink hotDrink;
	public Restaurant(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}
	
	public void prepareHotDrink()
	{
		hotDrink.prepareHotDrink();
	}
}
