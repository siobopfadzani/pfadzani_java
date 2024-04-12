public class testReferencing_4
{
	public static void main(String [] args)
	{
		String [][] array1 = new String[][]{{"hello","you are"},{"blessed"}};
		String [][] array2 = array1;
		
		System.out.println("values of array2 after bieng refernced");
		System.out.println();
		for (String [] row : array2)
		{
			for (String col : row)
			{
				System.out.println(col);
				
			}
		}
		System.out.println();
		System.out.println("populated array2 with zeros");
		System.out.println();
		for (int i = 0;i<array2.length;i++)
		{
			for (int j = 0; j < array2[i].length;j++)
			{
				array2[i][j]= "0";
				System.out.println(array2[i][j]+ " ");
			}

		}

	}
}