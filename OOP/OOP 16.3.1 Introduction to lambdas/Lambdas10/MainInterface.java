package Lambdas10;

public class MainInterface {
    public static void main(String[] args) {
        IntPrimitiveConsumer primitive = (value) -> System.out.println("value : " + value);
        primitive.intPrimitiveConsumer(94);
    }
}
