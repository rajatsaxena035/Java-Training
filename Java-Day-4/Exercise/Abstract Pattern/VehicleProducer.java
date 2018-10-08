class VehicleProducer
{
	public static Vehicle getVehicle(String choice)
	{
		if(choice.equalsIgnoreCase("CAR"))
		{
			return new Car();
		}
		else if(choice.equalsIgnoreCase("BOAT"))
		{
			return new Boat();
		}
		return null;
	}
}