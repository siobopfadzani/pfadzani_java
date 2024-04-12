public class test3
{
	public static void main(String[]args)
	{
	   
	   int x = 5;
       String result = (x > 0)? ((x < 10) ? "x is less than 10" : "x is greater than or equal to 10"): "x is less than or equal to 0";
       System.out.println(result);

	}
}