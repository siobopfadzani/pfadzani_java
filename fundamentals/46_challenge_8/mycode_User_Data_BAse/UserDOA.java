import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UserData {
   public static String[][] userData = new String[100][5];
   public static int position = 0;






   

   public static void main(String[] args) {
      
        Scanner scanDetails = new Scanner(System.in);

        
        while (true) {
            System.out.println("1. Add a user");
            System.out.println("2. Update a user");
            System.out.println("3. find user by Email")
            System.out.println("4. Delete a user");
            System.out.println("5. List saved users");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanDetails.nextInt();
            scanDetails.nextLine();  

            switch (choice) {
                case 1:
                    AddUsers(scanDetails);
                    break;
                case 2:        
                    updateUser(scanDetails);
                    break;
                case 3:
                    listUser(scanDetails);
                    break;
                case 4:
                    deleteUser(scanDetails);
                case 5:
                    listuser(scanDetails);
                case 6:
                    return;
                 
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        Addusers addedUsers = new Addusers();
        addedUsers.addUser(AddUsers);
    }
}


