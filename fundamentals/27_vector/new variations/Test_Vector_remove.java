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

			for(int i =0; i < vehicles.size();i++)
			{
				vehicles.remove(2);
				System.out.println("list of vehicles "+ vehicles);
				vehicles.add(2, "toyota");
			}
			System.out.println(vehicles);
	}
}