package Exam5.Question11;

public class A {
    public double m1(int a)
    {
        return a*10/4-30;
    }
    public static void main(String[] args) {
        
    }
    
}
class A2 extends A
{
    public double m1(int a)
    {
        return a*10/4.0;
    }
}
