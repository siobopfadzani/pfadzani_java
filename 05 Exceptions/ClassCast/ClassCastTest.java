package ClassCast;

public class ClassCastTest {
	public static void main(String[] args) {
		Object exception = new Object();

		try
		{
			System.out.println("Step 1");
			Exception exception2 = (Exception)exception;
		}
		catch(ClassCastException cle)
		{	
			System.out.println("Step 2 caught");
		}
	
		
		
		
		
	}
}
