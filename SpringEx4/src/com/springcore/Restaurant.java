package com.springcore;

public class Restaurant
{
	private String welcomeNote;
	public void setWelcomeNote(String welcomeNote)
	{
		this.welcomeNote = welcomeNote;
	}
	
	public void greetCustomer()
	{
		System.out.println(welcomeNote);
	}
	
	public void init()
	{
		System.out.println("init");
	}
	
	public void destroy()
	{
		System.out.println("destroy");
	}
}
