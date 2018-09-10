class Contact
{
	private String name;
	private String email;
	
	Address address;
	Phone phone;

	Contact(String name, String email, Address address, Phone phone)
	{
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}

	public String getName()
	{
		return name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}
}