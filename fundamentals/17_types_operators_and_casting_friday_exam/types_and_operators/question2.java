public class question1
{
	public static void main(String[]args)
	{
		int a = 20;
		a++;

		a += a % 5 + 7;
		System.out.println("a ="+a);

		int b = a + 10;
		
		b += b;
		System.out.println(a==b);
		
	}
}