public class question9
{
	public static void main(String[]args)
	{
	
	//Breakdown of code to see the sequence of the code
		int a = 42;
		double b = 42.25;
		a = --a ;
		System.out.println("a at breakdown = " + a);

		a = a * a;
		System.out.println("a at breakdown = " + a);

		a = a%10;
		System.out.println("a at breakdown = " + a);
		
		a = a + 41/2;
		System.out.println("a at breakdown = " + a);

		b = b%10;
		System.out.println(" b = at breakdown " + b);
		
	//Original code

		int x = 42;
		double y = 42.25;
		x = --x * x % 10 + x /2;
		y = y%10;
		System.out.println("x " +x +" y = " +y);
	}
}