class Phone
{
	private int internationalAreaCode;
	private int prefix;
	private int number;

	Phone(int internationalAreaCode, int prefix, int number)
	{
		this.internationalAreaCode = internationalAreaCode;
		this.prefix = prefix;
		this.number = number;
	}

	public int getInternationAreaCode()
	{
		return internationalAreaCode;
	}

	public int getPrefix()
	{
		return prefix;
	}

	public int getNumber()
	{
		return number;
	}

	public void setInternationalAreaCode(int internationalAreaCode)
	{
		this.internationalAreaCode = internationalAreaCode;
	}

	public void setPrefix(int prefix)
	{
		this.prefix = prefix;
	}

	public void setNumber(int number)
	{
		this.number = number;
	}
}