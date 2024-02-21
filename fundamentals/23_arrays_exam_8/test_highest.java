public class test_highest
{
	public static void main(String[]args)
	{
		int arr[] = new int []{10,2,40,50,70,20,30};
		int max = max_num(arr);
		System.out.println(max);
	}
	
	public static int max_num(int number[])
	{
		int numbers = number[0];

		for (int view : number)
		{
			if(view > numbers)
			{
				numbers = view;

			}
			
		}
		return numbers;
	}
}
