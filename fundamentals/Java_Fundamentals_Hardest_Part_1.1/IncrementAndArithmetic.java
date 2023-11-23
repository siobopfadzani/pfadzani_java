public class IncrementAndArithmetic {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        a++;
        a--;
        a = 10 + b;
        b -= 3;
        
        int result = a * b;
        result--;
        
        if (result > 50)
        {
            result++;
        }
        System.out.println("Result: " + result);
    }
}
