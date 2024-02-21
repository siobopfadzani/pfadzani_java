// Create an empty three dimensional array.
// Create another two dimensional array.
// Populate a two dimensional array.
// Assign a three dimensional array to a two dimensional array.(Populate the 3D with the 2D)
// Iterate through the array 3D and print the elements of each array within.
// For each iteration, represent the values at 0, at 1, 2 etc.


// Create a single dimensional array and assign the first value within the 3D ”[1][0]” array to it.
// Iterate through the array: the size of the first array within the 1D should be 5.
// For each iteration, represent the values at 0, at 1, 2 etc.

// Create an empty three dimensional array.
//Declare Array_3D as 3D array with dimensions [2][][]
// -Array = 3 dimensions;


// Create another two dimensional array.
//Declare Array_2D as 2D array and initialize it with values
// -Array2 = populated 2 dimensions;

// Populate a two dimensional array.
// -Array2 = populated 2 dimensions;

// Assign a three dimensional array to a two dimensional array.(Populate the 3D with the 2D)
//Assign Array_3D[0] to Array_2D
//- Array_3D position 0 = elements of Array_2D

// -For each element in Array:
// increment the element with 3
// print each element 1 by 1.
//iterate for i from 0 to length of Array_3D 
//  - for i to length of Array_3D increment i

//iterate for j from 0 to length of Array_3D increment j
//  - for j to length of Array_3D increment j

//iterate for k from 0 to length of Array_3D increment k
//  - for k to length of Array_3D increment k

//print Array_3D[i][j][k]

//move to nextline

//Declare Array_1D as single array [5]
//  - Array_1D =  int ;

//Assign Arr_3D[1][0] to Array_1D
// - Array_3D position 0 and 1 = Array_1D

//iterate for i from o to length of Array_1D increment i

public class jacked_arrays3
{
	public static void main(String[]args)
	{
		int [][][] Array_3D = new int[3][3][3];
		int [][] Array_2D = new int [2][6];
	    Array_2D = new int [][]{{1,2,3,4,5,6},{4,5,6,7,8}};
		int [] Array_1D = new int[5];

		Array_3D[0] = Array_2D;
		

		for (int i = 0; i < Array_3D.length;i++)
		{
			for(int j = 0; j < Array_3D[i].length;j++)
			{
				for (int k =0; k <Array_3D[i][j].length;k++)
				{	
					System.out.println(i + "  " +Array_3D[i][j][k]+" ");
				}
			}
			
		}
		System.out.println(" Array_1D ");

		Array_1D = Array_3D[1][0];
		for (int temp :Array_1D)
		{
			System.out.println(Array_1D[temp]);
		}
	}
}





// for loo
// iterate through the array
//