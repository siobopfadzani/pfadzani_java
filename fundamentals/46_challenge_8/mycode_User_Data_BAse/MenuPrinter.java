
It seems like you're trying to create a menu system in Java using a MenuPrinter class and a Prompter class for user input. Here's how you can integrate the Prompter class into your MenuPrinter class to achieve the desired functionality:

java
Copy code
public class Prompter {

    private static Scanner scanner = new Scanner(System.in);

    public static String prompt(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }
}

import java.util.Scanner;

public class MenuPrinter {

    private Scanner scanner;

    public MenuPrinter() {
        this.scanner = new Scanner(System.in);
    }

    public void menuPrinter() {
        while (true) {
            System.out.println("1. Add a user");
            System.out.println("2. Update a user");
            System.out.println("3. Find user by Email");
            System.out.println("4. Delete a user");
            System.out.println("5. List saved users");
            System.out.println("6. Exit");

            int choice = Integer.parseInt(Prompter.prompt("Enter your choice:"));

            switch (choice) {
                case 1:
                    UserDOA1.createUser(null, null, null, null, null);
                    break;
                case 2:
                    UserDOA1.updateUser(null, null, null, null, null);;
                    break;
                case 3:
                    UserDOA1.findAll();
                    break;
                case 4:
                    UserDOA1.deleteUser(null);
                    break;
                case 5:
                    UserDOA1().;
                    break;
                case 6:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }