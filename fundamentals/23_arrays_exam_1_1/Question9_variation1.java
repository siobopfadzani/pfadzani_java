public class Question9
{
	public static void main(String[]args)
	{
		int [] Arr1;
		int [] Arr2 = new int[3];
		char [] Arr3 = {'a','b'};
		char [] Arr4;
		Arr4 = Arr3;
		Arr1 = Arr2;
		Arr1 = Arr2;
		System.out.println(Arr1[0]+ ":"+Arr1[1]+ ":"+Arr3[0]);

	}
}