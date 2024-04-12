public class Test{
   public static void main(String[]args){
	String variable1 ="1";
	if (variable1.equals(" ")){
		System.out.println("your guess is too low");
	}
	else if(variable1.equals("1")){
		System.out.println("you are right");
	}
	else{
		System.out.println("your guess is too high");
	}
   }
}
