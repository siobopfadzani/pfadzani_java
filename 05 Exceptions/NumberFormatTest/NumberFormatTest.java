package NumberFormatTest;

public class NumberFormatTest {
	public static void main(String[] args) {
        String number ;
		try 
        {
            System.out.println("Step 1");
            number = "2345Q";
            int converted = Integer.parseInt(number);
        }

        catch(NumberFormatException e)
        {
            System.out.println("numberformat Wrong ");
            System.out.println("Step 2");

        }
		
		
		
		
	}
}
