class Address
{
	private String name;
	private int postalCode;
	private String city;
	private String country;

	Address(String name, int postalCode, String city, String country)
	{
		this.name = name;
		this.postalCode = postalCode;
		this.city = city;
		this.country = country;
	}

	public String getName()
	{
		return name;
	}

	public int getPostalCode()
	{
		return postalCode;
	}

	public String getCity()
	{
		return city;
	}

	public String getCountry()
	{
		return country;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setPostalCode(int postalCode)
	{
		this.postalCode = postalCode;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}
}