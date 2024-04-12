public class MyClass {
    public static void main(String[]args)
    {
        MYInterface myInterface = ()-> {
            System.out.println("my first lambda");
            return (int)22.78;
        };
        System.out.println(myInterface.myMethod());

    }
    
}
