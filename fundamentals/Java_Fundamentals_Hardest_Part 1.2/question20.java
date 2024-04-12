public class question20
{
	public static void main(String[]args)
	{
		int count =0;
	//breakdown of code to see the sequence of the code
		for (int a =0;a<10;a++)
		{
				System.out.println("first iteration");
				System.out.println("a is " + a);

			for (int b=0;b <10;b ++)
			{
				System.out.println("second iteration");
				System.out.println("b is " + b);
				
				for (int c = 0; c < 10;c ++)
				{
					System.out.println("third iteration");
				    System.out.println("c is " + c);
					
					if(2*a + b  >= 3*c)
					{
						count++;
							System.out.println("count is: " + count);
		
				    }

				}
			}
		}System.out.println("count is " + count);

	//Original code

		int cnt = 0;
		for (int i = 0; i < 10; i++) // This line has an issue
    		for (int j = 0; j < 10; j++)
        		for (int k = 0; k < 10; k++)
           			 if (2 * i + j >= 3 * k)
               			 cnt++;
			System.out.println(cnt);

	}
}