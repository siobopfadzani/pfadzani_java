public class TestClass
{
	public static void main(String[]args)
	{
		Barbie b = new Barbie("mydoll");
	}
}
class Doll
{
	String name;
	Doll(String nm)
	{
		this.name =nm;
	}
}
class Barbie extends Doll
{
	Barbie()
	{
		this("hi");
	}
	Barbie(String nm)
	{
		super(nm);
	}
}