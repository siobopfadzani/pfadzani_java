package Q44;

enum Enums
{
	ONE("ONE"),TWO("TWO"),THREE("THREE");
	String s = "NAME";

	private Enums(String s)
	{
		this.s = s;
	}
	void method ()
	{
		System.out.println(s);
	}
}