package Exam1.Question52;

public class TestClass {
    public static void main(String[] args) {
        String s = "hello";
        StringBuilder sb = new StringBuilder("hello");
        sb.reverse();
        sb.reverse();
        if(s == sb.toString())System.out.println("equal");
        else System.out.println("not equal");

            
        }
    }
    

