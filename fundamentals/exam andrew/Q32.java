public class Q32
{
	public static void main(String[]args)
	{
		
		int i = 0;
		int j = 5;
		label: for(;;i++){
			for(;;--j) if(i>j)break label;
		}
		System.out.println(i + " "+ j);
	}
}

