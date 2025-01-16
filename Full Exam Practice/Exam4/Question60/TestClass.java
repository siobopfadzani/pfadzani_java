package Exam4.Question60;

public class TestClass {
    static TestClass ref;
    String[] arguments;
    public static void main(String[] args) {
        ref = new TestClass();
        ref.func(args);

        String hi = "hello".concat("world");
        hi.concat("yes");
        String hello = "hello".concat(hi);
        System.out.println(hi);

        ;
    }
    public void func(String[]args)
    {
        ref.arguments = args;
    }
    
}
