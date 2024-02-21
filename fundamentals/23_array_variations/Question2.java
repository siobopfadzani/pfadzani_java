
public class TestIt
{
	public static void main(String[]args)
	{
		int [] myArray = {1,2,3,4,5};

		changeIT.doIt(myArray);
		
		for(int j = 0;j <myArray.length;j++)
		{
			System.out.println(myArray[j] + " ");
		}
	}
}
public class changeIT
{
	static void doIt(int[] z)
	{
		z = null;
		
	}
}
