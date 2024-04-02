
class Eagle extends Bird
{
	public String name;
	int i = 50;


	public Eagle(String name)
	{
		this.name = name;
	}


	public static void main(String[]args)
	{
		System.out.println(new Eagle("Bald Eaagle").name);
		System.out.println("b" + new Bird().i );

	}
}