package Q35;
class Jungle
{
	public static void main(String[]args)
	{
		Animal animal = new Lion();
		Lion lion = new Lion();
		if (lion instanceof animal)
		{
			System.out.println(1);
		}
	}
}