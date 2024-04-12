public class question14
{
	public static void main(String[]args)
	{

	//breakdown of code to show the sequence of the code
		
		double b = 0152;
		System.out.println("hexadecimal value before arithmetic operation " + b);

		b = --b;
		System.out.println("value of b after decrement " + b);

		b =(b / 2);
		System.out.println("value of b after division " + b);

		b = b *2;
		System.out.println("value of b after multiplication " + b);

		b = b * b;
		System.out.println("value of b after multiplication " + b);

		int c = (int)b;
		
		System.out.println("value at breakdown = " + c);

	//Original code

		int a = 0152;
		a*=--a/2*2;
		System.out.println("value of a = " + a);
	}
}