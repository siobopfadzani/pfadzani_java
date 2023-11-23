import java.util.Scanner;

public class MenuPrinter {

    public void menuPrinter() {
        while (true) {
            System.out.println("1. Add a user");
            System.out.println("2. Update a user");
            System.out.println("3. Find user by Email");
            System.out.println("4. Delete a user");
            System.out.println("5. List saved users");
            System.out.println("6. Exit");

            int choice = Prompter.prompt();

            switch (choice) {
                case 1:
                  createUser(scanDetails);
                    break;
                case 2:
                    updateUser(scanDetails);
                    break;
                case 3:
                    listUser(scanDetails);
                    break;
                case 4:
                    deleteUser(scanDetails);
                    break;
                case 5:
                    listUser(scanDetails);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }


}
