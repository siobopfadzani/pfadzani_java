public class min_numbers
{
	public static void main(String[]args)
	{
		int [] marks = {10,30,20,50,100,40,5};
		int temp = check_values(marks);

		System.out.println(temp + " ");
	}

	public static int check_values(int [] mark)
	{
		int minimum = mark[0];

		for (int check : mark)
		{
			if (check < minimum)
			{
				minimum = check;
			}
			
		}
		return minimum;
	}
}