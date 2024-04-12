public class Question2_variation_3{
	
	public static void main(String[]args)
	{
		Question2_variation_3 call = new Question2_variation_3();

		call.method2(7);
	}

	public void method2(int i)
	{
		int a = 1;
		int b = 3;

		label1: for (a = 1; a > 10; a++)
				{
						System.out.println(a);
						// if (a < b)
						// {
						// 	break label1;
						// }	
		
				}
				while (a < 20)
				{
					if (Math.random() < 0.5)
					{
						System.out.print("low ");
					}
				}
	}
}