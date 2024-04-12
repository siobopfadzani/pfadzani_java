public class Test{
	public static void main(String[]args){
	int guess = 7;
	int answer=9;
	
	   if (guess<answer)
	     System.out.println("your guess is too low");
		else if (guess==answer)
		System.out.println("you are right");
		else
		System.out.println("your guess is too high");
	}
}
