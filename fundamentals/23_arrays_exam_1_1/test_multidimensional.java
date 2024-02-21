public class testReferencing
{
	public static void main(String[]args)
	{
		
		String [][] SA1 = new String[]{{"aaa","bbb"},{"ccc","ddd"}}; //String array with a reference SA1 which points to an object of a populated array, which has been populated with one string Array 
		String [][] SA3 = new String[SA1.length][SA1.length];

		SA3 = SA1;
		SA1 = SA3;
		int i = 0;
		for(String view : SA3)
		{
			System.out.println(view);
			i++;
		}
		System.out.println();

		System.arraycopy(SA3,0,SA1,2,1);

		for(String view1 : SA1)
		{
			System.out.println(view1);
			i++;
		}

	}
}