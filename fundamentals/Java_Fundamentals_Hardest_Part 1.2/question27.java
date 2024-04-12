public class question27
{
	public static void main(String[]args)
	{
	//breakdown to show the sequence of the code
		byte bx =118;
		short sx = 100;
		int ix =670000;
		long lx =190;
		float fx = 167;
		double dx = 687.9f;

	    ix = (int)(double)(dx/fx);
	    System.out.println("z in breakdown " + ix);
		ix = (int)(double)( ix*lx);
		ix = (int)(double)(ix + sx +bx);
		System.out.println("z in breakdown " + ix);

		




	//original code

		byte b =118;
		short s = 100;
		int i =670000;
		long l =190;
		float f = 167;
		double d = 687.9f;
		i =(int)(s+b+d/f*l);
		System.out.println(i);
		i = s +b +(int)(d/f*l);
		System.out.println(i);
	}
}