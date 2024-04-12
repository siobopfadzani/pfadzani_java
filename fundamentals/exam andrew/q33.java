public class Q33
{
	public static void main(String[]args)
	{
		
		int i=7;

		int j = (i*30-2)/100;
		point1:for(;j<10;j++){
			boolean flag = false;
			while(!flag){
				if(Math.random()>0.5)break point1;
			}
		}
		
		while (j>0)
		{
			System.out.println(--j);
			if(j==4)break point1;
		}
	}
}

