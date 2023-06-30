public class Calculate {

    public double calculate() {
        int num_1 = 10;
        int num_2 = 30;
        double result = num_1 * num_2;

        if (num_1 <= num_2) {
            return result;
        } else {
            System.out.println("nope");
            return 0;
        }
    }

    public static void main(String[] args) {
        Calculate object = new Calculate();
        double calculatedResult = object.calculate();
        System.out.println(calculatedResult);
    }
}

