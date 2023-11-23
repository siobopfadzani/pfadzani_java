public class question3
{
	public static void main(String[]args)
	{
	//Breakdown that shows the sequence of the code
		
		double e = 20;
		double f = 20;
		double g = 20;
		double h = 20;

		h = h / 20;
		System.out.println("h = "+h);
		g = g * h;
		System.out.println("g = "+g);
		f = f - g;
		System.out.println("f = "+f);
		e = e + f;
		System.out.println("e = "+e);

		System.out.println("e = "+e+" f = "+ f +" g = "+ g +" h = "+h);
	// original code

		int a,b,c,d;
		a=b=c=d=20;
		a+=b-=c*=d/=20;
		System.out.println(a+" "+b+" "+c+" "+d);
	}
}