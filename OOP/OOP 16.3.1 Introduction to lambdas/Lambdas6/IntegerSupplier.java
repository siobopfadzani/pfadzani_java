package Lambdas6;

public class IntegerSupplier {
    public static void main(String[] args) 
    {
        IntegerSupplierInter supply = (A) -> {
            System.out.println(A);
            return A;
        };
        supply.get(100);
    }  
}
