public class question7
{
	
	public static void main(String[]args)
	{
	//breakdown of code to show the sequence of the code
		
		double e = 10.5;
		double f ;
		double g = 2;

		int  h = 0;
		e++;
		e = ++e;

		f = --e / g;
		System.out.println("f = " + f);

		f = f * 4;
		System.out.println("f = " + f);

		f = f % 2;
		System.out.println("f = " + f);

		f = f + e;
		System.out.println("f = " + f);

		double i =  e * g /h ;
		System.out.println("i = " + i);

		f = f % i;
		System.out.println("f = " + f);
	//Original code
		
		double a = 10.5;
		double b;
		double c = 2;
		int d = 0;
		a++;
		a = ++a;

		b =  a + --a/c--*4%2;
		b%=a*c/d;
		System.out.println(b);
	}
}