

public class DeleteUsers{

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
}

 
