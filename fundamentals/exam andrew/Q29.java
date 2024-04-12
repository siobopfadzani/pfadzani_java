public class Q29
{
	public static void main(String[]args)
	{
		
		
		int array[] = {0,1,2,3,4};
		int key = 3;
		for(int pos=0;pos<array.length;++pos)
		{
			if (array[pos]==key)
			{
				break;
			}
		}
		System.out.print("found "+key+"at"+pos);
	}
}

