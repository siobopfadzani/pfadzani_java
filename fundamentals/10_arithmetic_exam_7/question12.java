public class question12
{
	public static void main(String[]args)
	{

	//Breakdown of code to see the sequence of the code
		int c =5;
		double d =20;

		d = 6*19;
		System.out.println("value of d " + d);
		d = 19-d;
		System.out.println("value of d " + d);

		d = 19 / d;
		System.out.println("value of d " + d);

		d = 5 * d;
		System.out.println("value of d " + d);

 		d --;
 		System.out.println("value of d " + d);

 		d = ++d % c++;
 		System.out.println("value of d " + d);
 	


	//Original code 
		int a =  5;
		double b = 20;

		b = a++ * --b/(b++ - a--*--b);
		b--;
		b = ++b % a++;
		System.out.println(b);
	}
}