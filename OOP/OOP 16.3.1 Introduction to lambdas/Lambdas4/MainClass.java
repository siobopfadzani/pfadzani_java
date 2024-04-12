package Lambdas4;

public class MainClass {
    public static void main(String[] args) 
    {
        BiConsumer<String, String> biConsumer = (hello, goodbye) -> {
            System.out.println("Hello: " + hello);
            System.out.println("Goodbye: " + goodbye);
        };

        biConsumer.accept("Hi", "Bye");
    }
}
