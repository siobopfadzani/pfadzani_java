public class Test2 extends Test
{
	
	int i = 10;

	public static void main(String[]args)
	{
		Test2 test = new Test2();
		test.test();
		System.out.println(test.i);

	}
	 
	public void test()
	{
		System.out.println("sub");
	}
}