package JavaFullHardest2.Quesion2;
interface I{

}
 class A implements I{
    
}
class B extends A{

}
class C extends B{

}
public class Main
{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a = (B)(I)b;
        a = (B)(I)a;
        // a = (I)b;
        I i = (C)a;
    }

}