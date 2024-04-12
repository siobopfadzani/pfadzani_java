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

			for(int i =0; i < 3;i++)
			{
				boolean is_it_there = vehicles.contains("kia");
				System.out.println("size of the vector is "+ is_it_there);
				System.out.println("list of vehicles "+ vehicles);

			}
	}
}