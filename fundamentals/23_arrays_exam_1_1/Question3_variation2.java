public class Question3
{
	public static void main(String[]args)
	{
		String [] sA = {new String("aaa")," "};
		String [] Arr = {"SA"};
		byte [] Arr1 = {1,20,30,50,60,70};

		sA[1] = Arr[0];

		for (int i = 0 ; i <sA.length;i++)
		{
			System.out.println(Arr1[i]+" "+sA[i]);
		}

	}
}