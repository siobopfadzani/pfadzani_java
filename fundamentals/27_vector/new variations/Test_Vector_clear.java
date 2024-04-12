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
				vehicles.clear();
				System.out.println("list of vehicles "+ vehicles);
				vehicles.add(0, "toyota");
			}
			System.out.println(vehicles);
	}
}