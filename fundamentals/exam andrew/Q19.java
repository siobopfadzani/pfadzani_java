public class Q18
{
	public static void main(String[]args)
	{
		int i = 0;
		int j = 11;
		do{
			if(i>j){break;}
			j--;
		}
		while(i++<5);
		System.out.println(i+ " "+j);

	}
}
