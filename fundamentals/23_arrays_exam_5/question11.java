public class Example {
    public static void main(String[] args) {
        double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};

        // Calling the method with an array of type double
        myMethod(doubleArray);
    }

    // Method that takes a reference to an array of type double
    static void myMethod(double[] array) {
        for (double element : array) {
            System.out.println(element);
        }
    }
}
