package Exam4.Question17;

public class TestClass {
    public static void main(String[] args) {
        String s = "MINIMUM";
        System.out.println(s.substring(4,7));
        System.out.println(s.substring(5));
        System.out.println(s.indexOf('I',3));
        System.out.println(s.indexOf('I', 4));
    }

    
}
class MyBuilder extends StringBuilder {
    // Custom behavior can be added here if needed
}
