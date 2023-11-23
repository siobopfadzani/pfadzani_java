public class question18
{
	static String s = "";
	static String p ="";

	public static void main(String[] args)
	{
		//breakdown of code to see the sequence of the code
		p: 
		for(int j = 2; j <=7; j++)
		{  
			if(j == 3)
				break; 

			System.out.println("value of p " + p);
			System.out.println("value of j " + j);

			if(j == 5)
				break p; 
			p = p + j; 

			System.out.println("value of p " + p);
			System.out.println("value of j " + j);
		}
		System.out.println("breakdown final value of p " +p);

		// Original code without the label 'p'.
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
