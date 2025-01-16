class TestClass
{
	static int j;

	int i ;

	static
	{
		j =10;
		System.out.println("static  "+ j);
	}

	{
		i = 0;
		System.out.println("instance "+ i);
	}

	TestClass ()
	{
		System.out.println("in the constructor");

	}
   public static void main(String[]args)
   {
   	 new TestClass();
   }
	
}