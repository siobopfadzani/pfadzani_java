public class Question3
{
	public static void main(String[]args)
	{
		// String [] SA = new String [1]{"aaa"};  illegal declaration of the array (you cannot initialize the size of the array then populate it)
		String [] SA1 = new String[]{"aaa"};
		String [] SA2 = new String[1]; SA2[0] = "aaa"; 
		String [] SA3 = {new String("aaa")};
		String [] SA4 = {"aaa"};
	}
}