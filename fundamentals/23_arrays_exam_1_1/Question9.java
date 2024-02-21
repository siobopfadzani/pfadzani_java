public class Question9
{
	public static void main(String[]args)
	{
		boolean [] b1 = new boolean [2]; // reference 
		boolean [] b2 = {true,false};

		System.out.println((b1[0]==b2[0])+" : "+(b1[1]==b2[1]));

	}
}