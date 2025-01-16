package NestingExam2;

public class LambdaTest {
    public static void main(String[] args) {
        DontDoAnything be =(a, b)-> System.out.println("be idle");
        be.doNothing();


        float d = 0*1.5f;

        Integer i = new Integer(42);
        Long ln = new Long(42);
        Double dc = new Double(42.0);


       System.out.println( i.equals(dc));
       System.out.println(dc.equals(ln));
       System.out.println(ln.equals(42));
       
    }
}
interface Donothing
{
    default void doNothing(){System.out.println("do nothing");}
}
interface DontDoAnything extends Donothing
{
    abstract void doNothing(int a,int b);
}