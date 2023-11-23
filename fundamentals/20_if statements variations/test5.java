public class test3
{
	public static void main(String[]args)
	{
		int age= 20, weight = 50;
		if(age >= 18)
		{
			System.out.println("person is allowed to vote");
			if (weight >= 45)
			{
				System.out.println("person is allowed to vote and is fit to donate blood");
			}
			else{
				System.out.println("person is not fit to donate blood");
		        }
	          }
				else{

			     System.out.println("person is allowed to vote");
		}
 	}
}