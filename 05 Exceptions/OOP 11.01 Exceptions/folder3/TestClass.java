public class TestClass
{
	static MethodClass varibale1; 
	public static void main(String[]args)
	{
		try
		{
			varibale1.test();
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException expirienced");
		}
	}
}