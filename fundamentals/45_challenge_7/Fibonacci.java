public class Fibonacci
{
	public static void main(String args[])
	{
		int num_1 = 0, num_2 =1,num_3, count =30;

		System.out.println(num_1+" ");
		System.out.println(num_2);

		for (int i =2;i < count;i++)
		{
			num_3 = num_1 + num_2;
			System.out.println(num_3+" ");
			num_1 = num_2;
			num_2 = num_3;
		}
	}
}