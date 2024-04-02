public class TestClass
{
	String test = "A";

	public static void main(String[]args)
	{
		TestClass test = new TestClass("hello");
	}
	
	TestClass(String test)
	{
		this.test = test;

		System.out.println(test +" ");
	}
}