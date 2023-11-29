
public class jacked_arrays
{
	public static void main(String[]args)throws Exception
	{
		double Arr[][][] = new double[3][3][3];
		for (int i = 0;i < Arr.length;i++)
		{
			for(int j = 0;j < Arr.length;j++)
			{
				System.out.println(Arr[i][i][j]);
			}	
		}
		double Arr1 [][][] = new double [3][4][4];
		double test_variable = 100.0;
		Arr1[0][0][0] = test_variable ;
	}
}