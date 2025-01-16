package ExceptionInitializerError;

public class InitErrorTest {	
	static Object member = null;
	
	static{
        try
        {
            member.toString();
        }
        catch(ExceptionInInitializerError eI)
        {
            System.out.println("ExceptionInitializerError caught");
        }
	}
	
	public static void main(String[] args) {	
		System.out.println("Step 1");
	}
}
