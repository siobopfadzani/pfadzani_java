import java.util.Scanner;
public class PromptUserDetails{

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is youe name :");
        String name = scan.nextLine();
        
        System.out.println("What is your surname");
        String surname =scan.nextLine();
        
        System.out.println("Enter your date of birth (DD/MM/YYYY):");
        String date_of_birth = scan.nextLine();
        
        System.out.println("How far is favourite store from home");
        String distance_from_store = scan.nextLine();
        
        System.out.println("hello : "+ name +" " +surname);
        
        String year = date_of_birth.split("/")[2];
        
        int age = 2023 - Integer.parseInt(year);
        System.out.println("you are : "+ age +" years old ");
        
        int meters =1000;
        double miles =0.621371;
        long seconds = 365*24*60*60;
        long miliseconds = 365*24*60*60*1000;
        
        
        System.out.println("Distance in Mile: " +  miles*Integer.parseInt(distance_from_store)+ "mil." );
       
        System.out.println("Distance in meters: " +  meters*Integer.parseInt(distance_from_store)+ "m" );
        System.out.println("Age in seconds: " +  seconds*Integer.parseInt(year)+ "s" );
        
        System.out.println("Age in miliseconds:" +  miliseconds*Integer.parseInt(year)+ "mi." );
    
        
    }
}


