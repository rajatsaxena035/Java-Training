import java.util.*;
import static java.util.Comparators.comparing;
import static java.util.stream.Collectors.toList;

class Car
{
	private String make;
	private String model;
	private int year;

	public Car(String theMake, String theModel, int yearOfMake)
	{
		make = theMake;
		model = theModel;
		year = yearOfMake;
	}

	public String getMake()
	{
		return make;
	}

	public String getModel()
	{
		return model;
	}

	public int getYear()
	{
		return year;
	}
}
	
public class Iterating
{
	public static void main(String[] args) {
		List<Car> l = Iterating.createCars();
		List<String> l2 = Iterating.getModelAfter2000UsingFor(l);
		List<String> l3 = Iterating.getModelAfter2000UsingPipeline(l);

		System.out.println(l2);
		System.out.println(l3);
	}

	public static List<Car> createCars(){
		return Arrays.asList(

				new Car("Jeep", "Wrangler", 2011),
				new Car("Ford", "Focus", 2017),
			);
	}

	public static List<>




	Collections.sort(carsSortedByYear, new Comparator<Car>());


	public static List<String> getModelsAfter2000UsingPipeline(

			List<Car> cars) {
			return
			cars.stream()
	}

		)







}
