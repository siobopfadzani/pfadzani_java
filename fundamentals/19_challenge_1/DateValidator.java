import java.util.Scanner;
public class DateValidator {

    public boolean dateValidator(int year) {
        int currentYear = 2023;
	
        if (year >= 1900 && year <= currentYear) {
            return true;
        } else {
        System.out.println("Invalid Date entered");
            return false;
        }
    }
}

