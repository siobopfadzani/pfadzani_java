import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class UserDatabase {
    private List<String> users = new ArrayList<>();

    public void userMenu() {
        Scanner scanDetails = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add a user");
            System.out.println("2. Update a user");
            System.out.println("3. Delete a user");
            System.out.println("exit");

            System.out.println("Select an option:");
            int choose = scanDetails.nextInt();
            scanDetails.nextLine();

            switch (choose) {
                case 1:
                    addUser(scanDetails);
                    break;
                case 2:
                    updateUser(scanDetails);
                    break;
                case 3:
                    deleteUser(scanDetails);
                    break;
                case 4:
                    return;
            }
        }
    }

    public void addUser(Scanner scanDetails) {
        System.out.println("Enter your name:");
        String name = scanDetails.nextLine();
        users.add(name);

        System.out.println("Enter your surname:");
        String surname = scanDetails.nextLine();
        users.add(surname);

        System.out.println("Enter your email address:");
        String email = scanDetails.nextLine();
        users.add(email);

        System.out.println("Enter your date of birth (year/month/day):");
        String dateOfBirth = scanDetails.nextLine();
        users.add(dateOfBirth);

        int age = calculateAge(dateOfBirth);
        System.out.println("Hello " + name + " " + surname + ", your details have been saved to the database.");
        System.out.println("You are " + age + " years old.");
    }

    public void updateUser(Scanner scanDetails) {
        System.out.println("Enter the email address of the user to update:");
        String email = scanDetails.nextLine();
        boolean found = false;

        for (int i = 0; i < users.size(); i += 4) {
            if (users.get(i + 2).equals(email)) {
                found = true;
                int index = i;

                System.out.println("User found! Please provide the updated information:");

                System.out.print("Name: ");
                String name = scanDetails.nextLine();
                users.set(index, name);

                System.out.print("Surname: ");
                String surname = scanDetails.nextLine();
                users.set(index + 1, surname);

                System.out.print("Date of Birth (year/month/day): ");
                String dateOfBirth = scanDetails.nextLine();
                users.set(index + 3, dateOfBirth);
                
                
                int age = calculateAge(dateOfBirth);
                System.out.println("User updated successfully!");
                System.out.println("Hello " + name + " " + surname + ", your details have been updated.");
                System.out.println("You are " + age + " years old.");

                break;
            }
        }

        if (!found) {
            System.out.println("User not found!");
                boolean found = false;

    for (int i = 0; i < users.size(); i += 4) {
        if (users.get(i + 2).equals(email)) {
            found = true;
            int index = i;
            users.remove(index + 3);  
            users.remove(index + 2);  
            users.remove(index + 1);  
            users.remove(index);      
            
            System.out.println("User deleted successfully!");
            break;
          }
      }

   }
}
    
    public deleteUser(scanner scanDetails){
       System.out.prontln("To delete user information provide your email Address");
        String deleteinfo = scanDetails.nextLine();
        
    
    
    }
   
   private int calculateAge(String dateOfBirth) {
        String year = dateOfBirth.split("/")[0];
        int currentYear = 2023;
        return currentYear - Integer.parseInt(year);
    }
    public static void main(String[] args) {
        UserDatabase userDatabase = new UserDatabase();
        userDatabase.userMenu();
    }
}

