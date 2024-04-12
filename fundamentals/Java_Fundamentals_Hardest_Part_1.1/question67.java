public class question67
{
	public static void main(String[]args)
	{
		byte b = -127;
		short s = 3000;
		int i = 670000;
		long l = 1908899;
		float f = 167;
		double d = 687.9f;
		l = (long)(d%l);
		System.out.print("value of l is " +l);
	}
}