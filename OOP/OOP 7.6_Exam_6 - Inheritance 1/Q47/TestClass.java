package Q47;
public class TestClass
{
	public static void main(String[]args)
	{
		YYY obj = new YYY();
		obj.m();
	}
}
class XXX
{
	public void m()throws Exception{
		throw new Exception();
	}
}
class YYY extends XXX
{
	public void m(){

	}
}