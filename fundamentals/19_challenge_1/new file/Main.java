public class Main {
    public static void main(String args[]) {
        String name = Prompter.prompt("What is your name?");
        String surname = Prompter.prompt("What is your surname?");
        String dateOfBirth = Prompter.prompt("Enter your date of birth (YYYY/MM/DD)?");
        double age = AgeCalculator.ageCalculator(dateOfBirth);
        boolean dateValid = DateValidator.dateValidator(dateOfBirth, "true");

        String distance = Prompter.prompt("How far is your favorite store from your home?");
        double miles = MilesCalculator.calculateMiles(distance);
        boolean distanceIsNumeric = NumberValidator.numberValidator(distance, "true");

        if (dateValid && distanceIsNumeric) {
            Printer.printer(name, surname, age, miles);
        }
    }
}

