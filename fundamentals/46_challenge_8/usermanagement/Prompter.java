package usermanagement;
import java.util.Scanner;

public class Prompter
{
	public static String Prompt(String message)
	{
		scanner scan new Scanner(System.in);
		System.out.println(message);
		return scan.nextLine();
	}
}