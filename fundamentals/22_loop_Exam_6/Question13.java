public class Question13
{
	public static void main(String []args)
	{
		int x = 1;
		int y = 3;
		int i = 1;

		while (i <= x)
		{
			System.out.println(i);
			for(int j = 1;j <= y; ++j)
			{
				System.out.println(j);
			}
			++i;
		}
	}
}