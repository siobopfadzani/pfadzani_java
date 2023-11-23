public class question28
{
	public static void main(String[]args)
	{

	//breakdown of code to show the sequence of the code

		byte bx = -127;
		short sx =(short)200000;
		int ix = 670000;
		long lx = 190;
		float fx = 167;
		double dx = 687.9f;
		double r =0;
		r = (int)(double)(dx/fx);
		r = (int)(double)(r*lx);
		r = (int)(double)(r + ix + bx + sx);		
		System.out.println("value at breakdown "+ r);

	//Original code
		byte b = -127;
		short s =(short)200000;
		System.out.println(s);
		int i = 670000;
		long l = 190;
		float f = 167;
		double d = 687.9f;
		i = (short)(i+s+b+d/f*l);
		System.out.println(i);
	}
}