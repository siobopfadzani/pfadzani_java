import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

  public class UpdateUsers{
  
    public void updateUser(Scanner scanDetails) {
        System.out.print("Enter the email address of the user to update: ");
        String email = scanDetails.nextLine();

        boolean found = false;
        int index = 0;

        for (int i = 0; i < users.size(); i += 4) {
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

            System.out.print("Date of birth (year/month/day): ");
            String dateOfBirth = scanDetails.nextLine();
            users.set(index + 3, dateOfBirth);

            System.out.println("User updated successfully!");
            
            } else {
        
               System.out.println("User not found!");
        }
    }
    
}
