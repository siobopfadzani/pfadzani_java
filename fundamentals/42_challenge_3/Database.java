import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserData {
    private List<String> users = new ArrayList<>();

    public void UserInformation() {
        System.out.println("Hello choose from the options below");
        System.out.println("1. Add a user");
        System.out.println("2. Delete a user");
        System.out.println("3. Update a user");
        
        Scanner scanDetails = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanDetails.nextLine();
        users.add(name);
        
        System.out.println("what is your surname");
        String surname = scanDetails.nextLine();
        users.add(surname);
        
        System.out.println("what is your email address");
        String email = scanDetails.nextLine();
        users.add(email);
        
        System.out.println("what is your date of birth with format (year/month/day");
        String dateOfBirth =scanDetails.nextLine();
        String year = dateOfBirth.split("/")[0];
        
        int age = 2023 - Integer.parseInt(year);
        System.out.println("Hello "+ name +" "+ surname +" your details have been saved to the data base");
        System.out.println("you are : "+ age +" years old ");

     
    }
    
    public void upDateUser(){
      Scanner scanDetails = new Scanner(System.in);
      System.out.println("Enter the email address of the user to update");
      String email = scanDetails.nextLine();

        boolean found = false;
        int index = 0;

        for (int i = 0; i < users.size(); i += 3) {
            if (users.get(i + 2).equals(email)) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println("User found! Please provide the updated information.");

            System.out.print("Name: ");
            String name = scanDetails.nextLine();
            users.set(index, name);

            System.out.print("Surname: ");
            String surname = scanDetails.nextLine();
            users.set(index + 1, surname);
            
            System.out.print("age: ");
            String dateOfBirth = scanDetails.nextLine();
            users.set(index + 2, dateOfBirth);

            System.out.println("User updated successfully!");
        } else {
            System.out.println("User not found!");
        }
    }
    
  

    public static void main(String[] args) {
        UserData userData = new UserData();
        userData.UserInformation();
        userData.upDateUser();
    }
}

