package variation2.variation4;
interface interface1
{
    void method1();
    
}
interface interface2 extends interface1
{
    void method1();
    void method2();
    default void method3(){
        System.out.println("defualt method in the interface");
    }
}
public class MainClass3
{
    public static void main(String[] args) {
        interface2 inter = new interClass();
        inter.method1();
        
    }
}
class interClass implements interface2
{
    public void method1()
    {
        System.out.println("method 1");
    }
    public void method2()
    {
        System.out.println("method 2");
    }
}