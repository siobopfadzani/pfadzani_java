public class question17
{
	public static void main(String[]args)
	{
		String s = "";
		String b ="";
		
	//breakdown of code to see the sequence of the code
		p:
		for(int j =2;j < 7;j++)
		{
			if(j== 3) 
				continue;
			System.out.println("value of b " + b);
			System.out.println("value of j " + j);

			if(j == 5)
				break p;
			b = b +j;
			System.out.println("value of b " + b);
			System.out.println("value of j " + j);

		}
		System.out.println("value of b = " +b);

	//Original code
		p:
		for(int i =2;i < 7;i++)
		{
			if(i== 3) continue;
			if(i == 5)
			break p;
			s = s +i;
		}
		System.out.println(s);
	}
}