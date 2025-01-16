public class Main
{
	public static void main(String[]args)
	{
		new LocalInner().method1();
	}
}
class LocalInner
{
	private String value = " String value";

	void method1()
	{
		final class localInner
		{
			localInner()
			{
				System.out.println(" private " + value);
			}
		}
		localInner local = new localInner();
	}
}