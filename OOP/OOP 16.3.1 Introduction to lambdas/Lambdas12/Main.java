package Lambdas12;

public class Main {
    public static void main(String[] args) {
        LengthFinderFunction FindLength = (value) -> { 
            int length = value.length();
            return length;
        };
        System.out.println("length : " + FindLength.LengthFinderFunction(" FunctionLength"));
    }  
}
