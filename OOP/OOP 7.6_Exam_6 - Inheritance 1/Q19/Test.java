package Q19;

class Super
{
	{System.out.println("Super");}
}
class One
{
	 {System.out.println("one");}
}
class Two extends Super
{
	 {System.out.println("two");}
}
class Test
{
	public static void main(String[]args)
	{
		One o = new One();
		Two t = new Two();
	}
}