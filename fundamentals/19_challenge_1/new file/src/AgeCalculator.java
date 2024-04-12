public class AgeCalculator {
    public static double ageCalculator(String dateOfBirth) {
        double currentYear = 2023;
        String year = dateOfBirth.split("/")[0];
        double parsedYear = Double.parseDouble(year);
        return currentYear - parsedYear;
    }
}

