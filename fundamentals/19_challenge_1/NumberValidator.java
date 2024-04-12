import java.util.Scanner;

public class NumberValidator {

    public boolean numberValidator(int year, String distanceFromStore) {
    
        if (year >= 0 && year <= 9999 && (distanceFromStore >= 0 && distanceFromStore <=100000)) {
            return true;
        } else {
            return false;
        }
        
    }
}

