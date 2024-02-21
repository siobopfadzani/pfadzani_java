public class Question3
{
	public static void main(String[]args)
	{
		// String [] SA = new String [1]{"aaa"};  illegal declaration of the array (you cannot initialize the size of the array then populate it)
		String [] SA1 = new String[]{"aaa"}; //String array with a reference SA1 which points to an object of a populated array, which has been populated with one string Array 
		String [] SA2 = new String[1]; SA2[0] = "aaa";//String array with a refernce SA2 pointing to an object of an empty Array, this line also populated the first element with a STring "aaa" 
		String [] SA3 = {new String("aaa")};
		String [] SA4 = {"aaa"};
	}
}