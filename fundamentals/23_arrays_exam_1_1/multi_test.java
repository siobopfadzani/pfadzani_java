public class whatsamissing
{
	public static void main(String [] args)
	{
		int [][][] arr1 = {{{1,2,3,4},{2,4,6,8}},{{3,6,9,12},{0,2,4,6}},{{22,23,24,25}}};
		int [][] arr2 = arr1[1];

		System.out.println("2D Array values copied from 3D from the second element ");

		for (int []aray:arr2)
		{
			for(int elements : aray)
			{
				System.out.println(elements +" ");
			}
			System.out.println();
		}

		System.out.println("1D Array from 2D array ");

		int [] arr3 = arr2[1];

		for (int aray:arr3)
		{
			System.out.println(aray +" ");
		}

		System.out.println("1D Array from 3D array last row");

		int arr4[] = arr1[2][0];

		for (int aray:arr4)
		{
			System.out.println(aray +" ");
		}
	}
}