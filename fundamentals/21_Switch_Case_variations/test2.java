public class IfElseLadderExample {
    public static void main(String args[]) {
        int age = 55;
        if (age >= 60) {
            System.out.println("Person is double-vaccinated");
        } else if (age >= 50 && age < 60) {
            System.out.println("Person is vaccinated with single-dose only");
        } else if (age >= 40 && age < 50) {
            System.out.println("Person is not vaccinated");
        } else {
            System.out.println("Person is not eligible for vaccine ");
        }
    }
}
