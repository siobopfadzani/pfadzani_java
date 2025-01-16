class Nested 
{
	private String value = " here";
	 class innerNested
	{
		void print()
		{
			System.out.println("inner class " + value);
		}
	} 
}
public class Main
{
	public static void main(String[]args)
	{
		Nested nest = new Nested();
		Nested.innerNested nest2 = nest.new innerNested();
		nest2.print();
		
	}
}