public class Question2
{
	public static void main(String[]args)throws Exception
	{
		int intValue = 123;
		double doubleValue = 123.45;
		
		doubleValue = intValue;
		System.out.println("implicit cast from double to int " +doubleValue);

		
		long longValue = (long) intValue;
		System.out.println("int to long " + longValue);

		float floatValue = (float) doubleValue;
		System.out.println("double to float "+ floatValue);



	}
}