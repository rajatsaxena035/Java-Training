public class Demo
{
	public static void main(String[] args)
	{	
		Vehicle v1 = VehicleProducer.getVehicle("CAR");
		v1.startEngine();
		v1.stopEngine();
		v1.move();

		Vehicle v2 = VehicleProducer.getVehicle("BOAT");
		v2.startEngine();
		v2.stopEngine();
		v2.move();
	}
}