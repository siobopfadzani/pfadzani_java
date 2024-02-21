public class TryCatchExample {

    public static void main(String[] args) 
    {
        try 
        {
            // Code that might throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);  // This line will not be reached
        } catch (ArithmeticException e) {
            // Code to handle the exception
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after the try-catch block.");
    }

    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
