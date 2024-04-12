public class question13
{
	public static void main(String[]args)
	{
		byte b_value  = 20;
		short s_value = (short)b_value;
		char c_value  = (char)(s_value);
		int  i_value  = (int)(c_value);
		long l_value  = (long)(i_value);
		float f_value = (float)(l_value);
		double d_value=	(double)(f_value);

		int i = 10;
		int n = i++%5;
		System.out.println(i+ " "+n);
	}
}