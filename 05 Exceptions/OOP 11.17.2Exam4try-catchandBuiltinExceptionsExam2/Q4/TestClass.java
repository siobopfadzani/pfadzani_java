class TestClass
{
	public static void main(String[]args) throws ExceptionInInitializerError
	{
		try
		{
			throw  new ExceptionInInitializerError("initilializer");
		}
		finally
		{

		}
	}
}