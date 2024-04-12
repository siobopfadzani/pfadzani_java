public class question18
{
	static String s = "";
	static String p ="";

	public static void main(String[] args)
	{
		p: 
		for(int i = 2; i <=7; i++)
		{
			if(i == 3)
				break; 
			if(i == 5)
				break p; 
			s = s + i; 
		}
		System.out.println(s); 
	}
}
