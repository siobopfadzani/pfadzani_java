
public class jacked_arrays5
{
	public static void main(String[]args)
	{
		double [][] Array_2D = new double[5][5];
		double [][] Array_2D_1 = {{1,2,3,4,5},{1,2,3,4,5}};

		Array_2D = Array_2D_1; 

		for (int i = 0; i < Array_2D.length;i++)
		{
			for(int j = 0; j < Array_2D[i].length;j++)
			{	
				System.out.print(Array_2D[i][j]+" ");	
			}
			System.out.println();
		}
	
	}
}