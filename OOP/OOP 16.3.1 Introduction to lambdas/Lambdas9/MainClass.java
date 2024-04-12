package Lambdas9;

public class MainClass {
    public static void main(String[] args) {
        IntegerConsumer consume = ((take) -> take);
        Integer print = consume.integerConsumer(35);
        System.out.println("value is :"+print);
    }
    
}
