package Q43;

public class TestClass
{
	public static void main(String[]args)
	{
		Aa a = new Aa();
		AA aa = new AA();
		System.out.println(a.getCode()+ " " + aa.getCode());
	}

	public int getCode()
	{
		 return 1;
	}
}

class Aa
{
	public int getCode()
	{
		return 2;
	}
}
class AA extends Aa
{
	public int getCode()
	{
		return 2;
	}
}