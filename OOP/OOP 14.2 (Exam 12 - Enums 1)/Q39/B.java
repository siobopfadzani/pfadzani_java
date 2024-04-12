package Q39;
enum B
{
	BBB;
	String s = "B";
	{
		A.AAA.s = A.AAA.s + s;
	}

	private B()
	{
		A.AAA.s = A.AAA.s + s;
	}
}
