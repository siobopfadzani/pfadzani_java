package Exam2.Question68.testPackage;

import Exam2.Question68.other.Other;

class Test {
    public static void main(String[] args) {
        String hello = "Hello",lo = "lo";
        // System.out.println((Other.Other.hello == hello));
        System.out.println((Exam2.Question68.other.Other.hello == hello)+" ");
        System.out.println((hello == ("Hel"+"lo"))+" ");
        System.out.println((hello == ("Hel"+lo))+" ");
        System.out.println(hello == ("Hel"+lo).intern());
    }
    
}
