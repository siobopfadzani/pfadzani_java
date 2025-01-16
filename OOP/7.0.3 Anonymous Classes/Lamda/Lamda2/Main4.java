package Lamda2;

import java.util.function.Predicate;

public class Main4 {
    public static void main(String[] args) {
        Predicate pred =(d) -> {System.out.println(d); return true;};
        pred.test(10);
    }
    
}
