import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserData {
    private List<String> users = new ArrayList<>();

    public void UserInformation() {
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
                    addUser(scanDetails);
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
    }

    public void addUser(Scanner scanDetails) {
        System.out.print("What is your name? ");
        String name = scanDetails.nextLine();
        users.add(name);

        System.out.println("What is your surname?");
        String surname = scanDetails.nextLine();
        users.add(surname);

        System.out.println("What is your email address?");
        String email = scanDetails.nextLine();
        users.add(email);

        System.out.println("What is your date of birth with the format (year/month/day)?");
        String dateOfBirth = scanDetails.nextLine();
        users.add(dateOfBirth);

        System.out.println("Hello " + name + " " + surname + ", your details have been saved to the database.");
    }

    public void deleteUser(Scanner scanDetails) {
        System.out.print("Enter the email address of the user to delete: ");
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
            String name = users.get(index);
            String surname = users.get(index + 1);
            users.remove(index + 3);
            users.remove(index + 2);
            users.remove(index + 1);
            users.remove(index);

            System.out.println("User " + name + " " + surname + " has been deleted.");
        } else {
            System.out.println("User not found!");
        }
    }

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
    
    public void listUsers(Scanner scanDetails){
        System.out.println(users);
    }

    public static void main(String[] args) {
        UserData userData = new UserData();
        userData.UserInformation();
    }
}

