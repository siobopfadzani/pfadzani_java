
public class jacked_arrays4
{
	public static void main(String[]args)
	{
		int [][] Array_2D = {{1,2,3,4,5,6},{4,5,6,7,8}};

		int [][][] Array_3D = {{{},{},{}},{{}}};
		int value = 10;

		Array_3D[0] = Array_2D;
		Array_3D[1] = Array_2D;
		Array_2D[1][3] = value;
		Array_3D[1][1][0] = value;

		for (int i = 0; i < Array_3D.length;i++)
		{
			for(int j = 0; j < Array_3D[i].length;j++)
			{
				for (int k =0; k <Array_3D[i][j].length;k++)
				{	
					System.out.print(Array_3D[i][j][k]+" ");
				}
			}
			System.out.println();

		}

	}
}