package Lambdas7;

public class IntPrimitiveSupplier {
    public static void main(String[] args) {
        IntPrimitiveSupplierInterface inPrimitiveSupplier = (s) -> {
            System.out.println("supply "+ s);
            return s;
        }; 
        inPrimitiveSupplier.inPrimitiveSupplier(47);
    }
}
