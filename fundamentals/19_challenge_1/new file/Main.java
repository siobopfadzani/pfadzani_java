public class Main {
    public static void main(String args[]) {
        String name = Prompter.prompt("What is your name?");
        String surname = Prompter.prompt("What is your surname?");
        String dateOfBirth = Prompter.prompt("Enter your date of birth (YYYY/MM/DD)?");

        
        while (!DateValidator.dateValidator(dateOfBirth)){
        
           System.out.println("Invalid date of birth. Please enter a date in the format yyyy/mm/dd.");
           dateOfBirth = Prompter.prompt("Enter your date of birth (YYYY/MM/DD)?");
        }
        
        String distance = Prompter.prompt("How far is your favorite store from your home?");
        while (!NumberValidator.numberValidator(distance)){
        
           System.out.println("Distance provided not valid");
           distance = Prompter.prompt("How far is your favorite store from your home?");
        }
        double age = AgeCalculator.ageCalculator(dateOfBirth);

        Printer.printer(name, surname,dateOfBirth);
        
        
        double miles = MilesCalculator.calculateMiles(distance);
        boolean distanceIsNumeric = NumberValidator.numberValidator(distance);
        
        System.out.println("Hello : " + name + " " + surname);
        System.out.println("You are : " + age );
        System.out.println("Distance  from favorite store in km is:" + distance +"km");
        System.out.println("Distance  from favorite store in miles is :" + miles +"miles");

 
    }
}

