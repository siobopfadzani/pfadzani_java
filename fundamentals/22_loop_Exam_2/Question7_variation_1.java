public class Question7_variation_1
{
	public static void main(String[]args)
	{
		int a = 10;
		int b = 20;

		do
		{

		  if (a == 15) break;

		}while(--b < ++a);
		
		System.out.println(a + " "+b);
	}
}