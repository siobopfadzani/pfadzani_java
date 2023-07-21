import java.util.Scanner;

public class UserPrompter {

    public void userPrompter() {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = scan.nextLine();

        System.out.println("What is your surname: ");
        String surname = scan.nextLine();

        System.out.println("Enter your date of birth (yyyy/mm/dd): ");
        String dateOfBirth = scan.nextLine();

        System.out.println("How far is your favorite store from home: ");
        String distanceFromStore = scan.nextLine();

        System.out.println("Hello " + name + " " + surname);

        AgeCalculator calculator = new AgeCalculator();
        calculator.calculateAge(dateOfBirth);

        DistanceCalculator calculate = new DistanceCalculator();
        calculate.distanceCalculator(distanceFromStore);
    }
}

