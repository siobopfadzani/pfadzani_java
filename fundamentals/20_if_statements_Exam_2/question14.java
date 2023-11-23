public class Question14
{
	public static void main(String[]args)
	{
		String test ="true";
		boolean result = false;

		if(test.equals("True"))
		{
			System.out.println("Your guess is too High");
		}
		else if (test.equals("true ")){
			System.out.println("you are right");
		}
		else if (result = true){
			System.out.println("keep on trying");
		}
		else{
			System.out.println("your guess is too high");
		}
	}
}