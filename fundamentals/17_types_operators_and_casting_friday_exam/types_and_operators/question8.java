public class question8
{
	public static void main(String[]args)
	{
		int x = 10;
		int y = 20;
		double z = x % y + y % x;
		z++;
		z = z%1;
		System.out.println("z "+z);
	}
}