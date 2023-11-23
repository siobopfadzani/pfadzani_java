public class types
{
	public static void main(String[]args)
	{
		int result = 3; 
		System.out.println(result);
		int Original_result = result;

		result = result - 1;

		System.out.println(Original_result);
		Original_result = result; 

		result = result *2;
		
		System.out.println(Original_result+result);
		Original_result = result;

		result = result/2;

		System.out.println(Original_result+result);
		Original_result = result;

		result = result + 8;

		System.out.println(Original_result+result);
		Original_result = result;

		result = result%7;
		System.out.println(Original_result+result);
	
	}
}