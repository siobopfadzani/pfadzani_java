public class DateValidator {
    public static boolean dateValidator(String dateOfBirth, String prompt) {
        boolean goback = Boolean.parseBoolean(prompt);
        
        if (!dateOfBirth.matches("^\\d{4}/\\d{2}/\\d{2}$")) {
            System.out.println("Invalid date of birth. Please enter a date in the format yyyy/mm/dd.");
            return false;
        } else {
            return goback;
        }
    }
}

