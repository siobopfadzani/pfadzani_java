public class IndexOutTest {
	public static void main(String[] args) {
		int [] array = {444,55,666};
		int value;
		try
		{
			value = array[4];
			System.out.println("Value = "+value);

		}
		catch(IndexOutOfBoundsException iob)
		{
			System.out.println("Index out of bounce ");
		}	
	}
}
