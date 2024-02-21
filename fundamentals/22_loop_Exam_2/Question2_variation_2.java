public class Question2_variation_2{
	
	public static void main(String[]args)
	{
		Question2_variation_2 call = new Question2_variation_2();

		call.method2(7);
	}

	public void method2(int i)
	{
		int a;
		int b = 10;

		label1: for(a=0;a < 20;a++)
				{
				  System.out.print(a+"  "+b);
				  if (a > b)
				  {
				  	break label1;
				  }
				}
	}
}