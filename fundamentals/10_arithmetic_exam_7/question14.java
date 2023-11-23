public class question14
{
	public static void main(String[]args)
	{

	//breakdown of code to show the sequence of the code
		
		int d =  5;
		double e = 20;

		e = 19 - 6 * 19;
		System.out.println("e is = " +e);

		double f = 19.0/ e ;
		System.out.println("e is = " +f);

		e = 5 * f;
		System.out.println("e is = " +e);

		e = e - 1;
		System.out.println("e is = " +e);


		e = ++e % d++;
		System.out.println("e is = " +e);

		d = (char)++e;
		System.out.println("value of d " + d);

		d = (int)(e - e + d++);
		System.out.println("value of d " + d);

		

	//Original code

		int a =  5;
		double b = 20;

		b = a++ * --b/(b++ - a--*--b);
		b--;
		b = ++b % a++;
		a = (char)++b;
		a = (int)(b - b + a++);
		System.out.println("value of a " + a);
		
	}
}