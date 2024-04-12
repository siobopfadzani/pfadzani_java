import java.util.*;
public class Vectortest
{
	public static void main(String[]args)
	{
		Vector <Integer> Vectortest = new Vector <Integer>();

			Vectortest.add(10);
			Vectortest.add(20);
			Vectortest.add(30);
			Vectortest.add(40);
			Vectortest.add(50);
			Vectortest.add(60);
			Vectortest.add(70);
			Vectortest.add(80);
			Vectortest.add(100);



		for(int i = 0;i<Vectortest.size();i++)
		{
			Vectortest.remove(0);
			System.out.println(Vectortest);
		}


	}
}