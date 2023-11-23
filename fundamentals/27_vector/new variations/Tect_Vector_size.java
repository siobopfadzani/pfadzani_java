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
				
				System.out.println("size of the vector is "+ vehicles.size());
				System.out.println("list of vehicles "+ vehicles);

			}
	}
}