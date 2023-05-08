import java.util.Scanner;

public class GetInput{ 
     public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name and surname:");        
        String nameSurname = in.nextLine();
        System.out.println("hello " + nameSurname);
    }
}

