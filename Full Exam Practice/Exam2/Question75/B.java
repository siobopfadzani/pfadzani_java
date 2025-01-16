package Exam2.Question75;
class A{
   static int i =10;
    A(){print();}
    void print(){System.out.println("A");}
}
public class B extends A{
    int i = Math.round(3.5f);
    public static void main(String[] args) {
        A a = new B();
        a.print();
    }
    void print(){System.out.println(i);}
}

