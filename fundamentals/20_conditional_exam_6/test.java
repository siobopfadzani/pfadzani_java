public class Example {
    public static void main(String[] args) {
        int x;

        if (4>1) {
            x = 5;
        }

        // Error: Variable 'x' might not have been initialized
        System.out.println(x);
    }
}
