package Lambdas5;

public class StringSupplier {

    public static void main(String[] args) {
        Supplier stringSupplier = ()->{
                System.out.println("i am a supplier ");
                return args;
        };
        stringSupplier.get();
    }
    
}
