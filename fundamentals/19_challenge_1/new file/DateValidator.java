public class DateValidator {
    public static boolean dateValidator(String dateOfBirth) {

        if (dateOfBirth.length() != 10) {
            return false;
        }

        if (!dateOfBirth.matches("^\\d{4}/\\d{2}/\\d{2}$")) {
            return false;
        }

        return true;
    }
}

