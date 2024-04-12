public class question7
{
	public static void main(String[]args)
	{
		int age = 20;
		boolean isStudent = true;
		boolean isWorking = false;

		String status = (age >= 18)? (isStudent ? (isWorking ? "Adult student and employed" : "Adult student and not employed") : (isWorking ? "Adult non-student and employed" : "Adult non-student and not employed"))
    : "Minor";

		System.out.println("You are a " + status + ".");

	}
}