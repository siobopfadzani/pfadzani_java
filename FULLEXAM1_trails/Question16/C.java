package Question16;

class A{
    private int i = 10;
    public void f(){}
    public void g(){}
}
class B extends A{
    public int i = 20;
    public void g(){}
}
public class C {
    
        A a = new A();
         B b = new B();
            
}
