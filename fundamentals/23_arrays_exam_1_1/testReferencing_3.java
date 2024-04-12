public class testReferencing_3
{
	public static void main(String[]args)
	{
		
		int [][] arr = {{1,2,3,4,5},{2,3,4,5,6}};
		int [][] arr1 = new int[2][5];

		for (int i =0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length;j++)
			{
				arr1[i][j] = arr[i][j];
			}
		}

		for (int i = 0;i<arr1.length;i++)
		{
		
			for(int j = 0;j<arr1[i].length;j++)
			{
				System.out.println(arr1[i][j]+" ");
			}
				System.out.println();
		}

		System.out.println(" pointing elements of arr1 to arr3 using the reference ");
		int [][]arr3 = arr1; 

		for (int i = 0;i<arr1.length;i++)
		{
		
			for(int j = 0;j<arr1[i].length;j++)
			{
				System.out.println(arr3[i][j]+" ");
			}
				System.out.println();
		}
		System.out.println("value of arr3 at index arr3[0][1] is :"+ arr[0][1]);
		System.out.println();
		System.out.println("replace element of arr3[0][1] with 10");
		System.out.println();
		arr3[0][1] = 10;
		System.out.println("value of arr3 at index arr3[0][1] is :"+ arr3[0][1]);
	}
}