public class A extends B
{
	String surname;

	A(){}

	A(String surname){
		this.surname = surname;
	}

	public String toString()
	{
		return "my name is A " + surname;
	}
	public static void main(String[]args)
	{
		System.out.println(new A(){});
	}
}
class B extends C
{
	public String toString()
	{
		return "my name is B";
	}
}
class C implements D
{
	public String toString()
	{
	return "my name is C";
	}
}
interface D
{
	
}
class E
{
	public String toString()
	{
		return "my name is E";
	}
}