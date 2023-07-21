import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UserData {
    private List<String> users = new ArrayList<>();

   public static void main(String[] args) {
      
        Scanner scanDetails = new Scanner(System.in);

        
        while (true) {
            System.out.println("1. Add a user");
            System.out.println("2. Delete a user");
            System.out.println("3. Update a user");
            System.out.println("4. List saved users");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanDetails.nextInt();
            scanDetails.nextLine();  

            switch (choice) {
                case 1:
                    AddUsers(scanDetails);
                    break;
                case 2:
                    deleteUser(scanDetails);
                    break;
                case 3:
                    updateUser(scanDetails);
                    break;
                case 4:
                    listUsers(scanDetails);
                case 5:
                    return; 
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        Addusers addedUsers = new Addusers();
        addedUsers.addUser(AddUsers);
    }
}


