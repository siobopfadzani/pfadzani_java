import java.util.Scanner;

public class whiletest {
    public static void main(String args[]) {

      		  Scanner scan = new Scanner(System.in);

      		  int number = scan.nextInt(); 

       		 while (number <=1 || number >= 10) {
         		   System.out.println(number + " is not between 1 and 10. Try again.");
        		   number = scan.nextInt();
      		  }

        System.out.println(number + " is between 1 and 10.");
	}
}