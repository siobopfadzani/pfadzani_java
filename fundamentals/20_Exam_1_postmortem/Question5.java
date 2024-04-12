public class Question5
{
	public static void main(String[]args)
	{
		int a = 2000;
		String result = ((a%4==0)&&(a % 100 != 0))&&(a % 400==0)?(a % 400 == 0)?"first":"second":"third";
		System.out.println(result);

		//If statements
		if (a%4==0)
		{
			if(a % 100 != 0)
			{
				System.out.println("first");
			}
			else
			{
				System.out.println("second");
			}

		}else
		{
			System.out.println("third");
		}
	}
}