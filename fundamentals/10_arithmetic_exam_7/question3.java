public class question2
{
	public static void main(String[]args)
	{
	//Breakdown to show the sequence of the code
		double d = 10.5;
		double e ;
		double f = 2;
		d++;
		d = ++d;
	
		e = d /f--;
		System.out.println("e = " + e);
		e = e * 4;
		System.out.println("e = " + e);
		e = e % 2;
		System.out.println("e = " + e);
		e = e + d;
		System.out.println("e = " + e);

	//Original code
		
		double a = 10.5;
		double b;
		double c = 2;
		a++;
		a = ++a;

		b =  a + --a/c--*4%2;
		System.out.println(b);

	}
}