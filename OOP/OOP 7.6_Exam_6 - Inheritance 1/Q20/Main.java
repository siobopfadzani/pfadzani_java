class Main
{
	public static void main(String[]args)
	{
		A2 a = new A2();
		System.out.println(a.m1(10));
	}
}
class A
{
	public double m1(int a)
	{
		return a*10/4-30;
	}
	
}
class A2 extends A
{
	public double m1(int a)
	{
		return a*10/4.0;
	}
}
