public class Addusers{

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
]
