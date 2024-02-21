public class Question7
{
	public static void main(String[]args)
	{
		int [] Arr1;//An array of type int with a reference Arr1
		int [] Arr2 = new int[3];//array of type int with a reference Arr2 pointing to an object of an array of type int
		char [] Arr3 = {'a','b'};// an array of type char with a reference of Arr3 pointing to a populated array of char elements 'a' and 'b'
		Arr1 = Arr2; //reference Array Arr1 pointing to the array reference of Arr2
		//Arr1 = Arr3; //illegal assignment of array, arrays have to have the same data type(using the reference Arr3 we are pointing reference Arr1 to elements of reference Arr3)
		System.out.println(Arr1[0]+ ":"+Arr1[1]);

	}
}