package Lamda_functions.Lamdas;
import  Lamda_functions.Lamdas2.*;

import java.util.ArrayList;
import java.util.List;

public class LamdaFunction {
    public static void main(String[] args) {
        List<String> lidt = new ArrayList<>();

        lidt.add("hello");
        lidt.add("ello");
        lidt.add("llo");
        lidt.add("holly");
        lidt.add("ell");
        System.out.println(lidt);
        lidt.removeIf(s -> s.length() <= 3);
        System.out.println(lidt);


        LamdaFunction lam = new LamdaFunction();



    }
    
}
