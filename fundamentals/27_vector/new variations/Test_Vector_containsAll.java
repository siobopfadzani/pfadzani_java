import java.util.*;
public class Vectortest
{
	public static void main(String[]args)
	{
		Vector<String> vehicles = new Vector<String>();
			vehicles.add("MAC");
			vehicles.add("BMW");
			vehicles.add("toyota");
			vehicles.add("kia");

		Vector<String> cars = new Vector<String>();
			cars.add("MAC");
			cars.add("BMW");
			cars.add("ford");
			cars.add("kia");
			
			boolean containsAllElements = vehicles.containsAll(cars);
            System.out.println("List of vehicles contains all elements: " + containsAllElements);
	}
}