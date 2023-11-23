public class question2
{
	public static void main(String[]args)
	{
	//Breakdown to show the sequence of the code
		int g = 27;
		String h ="20";
		String i = g + h;
		System.out.println("string i = " + i);

		int f = Integer.parseInt(i);
		System.out.println("converted string to int = " + f);

		g = f + g;
		System.out.println("breakdown result = " + g);

	//Original code
		
		// int a = 27;
		// String b ="20";
		// String c = a + b;
		// a = (int)c + a;

		// System.out.println(a);

	}
}