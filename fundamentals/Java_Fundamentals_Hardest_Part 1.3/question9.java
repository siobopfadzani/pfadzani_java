public class question9
{
	public static void main(String[]args)
	{
	  int num1 = 0;
	  int num2 = 0;

//breakdown to show the sequence of the code
	    for (int j = 0; j< 5;j++)
	       {

	       	System.out.println("j = " +j);
	       	boolean b = ((++num1 > 2)&&(++num2 > 2));
	       	System.out.println("num1 "+ num1);
	       	System.out.println("num2 "+ num2);
	       	System.out.println("b = "+ b);

	       	 if (b)
	       	 {
	       	  	System.out.println("num1 = "+ num1);
	       	  	System.out.println("num2 = "+num2);
	       	  	num1++;
	       	  	System.out.println("num1 = "+num1);


	       	 }
	  	  

	//System.out.println("now running original code............ ");

//Original code

	  for(int i = 0; i < 5;i++)
	  {
	    if ((++num1 > 2)&&(++num2 > 2))
		{
			num1++;
		}
	  }
	  System.out.println(num1 + " and " + num2);
   }
}
}