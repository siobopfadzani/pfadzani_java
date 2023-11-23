public class question15
{
	public static void main(String[]args)
	{
		
	//Breakdown of the code to show the sequence of the code
		int c = 5;
		double d = 20;

		d = c++ - c-- * --d;
		System.out.println("d is " + d);
		
		d = 19 / d;
		System.out.println("value of d " + d);

		d = d++ * 6;
		System.out.println("value of d " + d); 

		d =  ++d %c++; 
		System.out.println("value of d " + d);

		c = (char)++d;
		System.out.println("value of c " + c);

	//Original code

		int a = 5;
		double b = 20;

		b = a++ * --b/(b++ - a-- * --b);
		b--;
		b = ++b%a++;
		a = (char)++b;
		System.out.println("a = " + a);
	}
}