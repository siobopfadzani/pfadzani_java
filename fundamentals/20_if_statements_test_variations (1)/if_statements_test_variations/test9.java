public class IfElseLadderExample {
    public static void main(String args[]) {
       
       // If Statement

        int x = 5;

        String result = (x > 0)? ((x < 10) ? "x is less than 10" : "x is greater than or equal to 10") : "x is less than or equal to 0";
		System.out.println(result);

      //Ternary Statement

		int a = 5;

		if (a > 0)
		{
			if(a < 10)
			{
				System.out.println("x is less than 10");
			}
			else
				{
					System.out.println("x is greater than or equal to 10");
				}
		}
		else 
			{
				System.out.println("x is less than or equal to 0");
			}
    }
}









