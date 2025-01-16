

public class TestClass
{

	public static void main(String[]args)
	{
		printable my = (e) ->{String e =""; return "yes";};	
	}
}
interface printable
{
	String isprintable(double d);
}
// class MyPrintable implements printable
// {
// 	public String isprintable(double d)
// 	{
// 		return "yes";
// 	}
// }

enum Levels 
{
	
	Top,BOTTOM,MEDIUM;
	private int value;
}