import java.util.Arrays;
import java.util.List;

public class MainClass
{
	public static void main(String[]args)
	{
		try 
		{
			m1();
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("1");
			throw new NullPointerException();
		}
		catch(NullPointerException e)
		{
			System.out.println("2");
			return;
		}
		catch (Exception e)
		{
			System.out.println("3");
		}
		finally
		{
			System.out.println("4");
		}
		System.out.println("end");
	
	}
	static void m1()
	{
		System.out.println("m1 starts");
		throw new IndexOutOfBoundsException("big bang ");
	}
		String d = "hi";
		float f = Float.valueOf(d).floatValue();
}