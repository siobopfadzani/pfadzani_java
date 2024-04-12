import java.util.Scanner;
public class AgeCalculator {

    public void calculateAge(String dateOfBirth) {
    
        long seconds = 365 * 24 * 60 * 60;
        long milliseconds = 365 * 24 * 60 * 60 * 1000;
        String year = dateOfBirth.split("/")[0];
        int parsedYear = Integer.parseInt(year);

        DateValidator dateValidator = new DateValidator();
     
        int age = 2023 - parsedYear;
        System.out.println("Your age is: " + age);
        System.out.println("Age in seconds: " + seconds * parsedYear + "s");
        System.out.println("Age in milliseconds: " + milliseconds * parsedYear + "ms");
    }
}

