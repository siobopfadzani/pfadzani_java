public class StaticVsInstance01
{
    public static void main(String[]args)
    {
        Counter01 counter1 = new Counter01();
        counter1.count();
        counter1.count();
        counter1.count();
        counter1.count();

        System.out.println("counter1 is at : " + counter1.getCounter());

        Counter01 counter2 = new Counter01();
        counter2.count();
        counter2.count();
        counter2.count();
        counter2.count();

        System.out.println("counter2 is at : " + counter2.getCounter());

    }
}
class Counter01{
    private static int counter;
    public int getCounter(){
        return  counter;
    }
    public void setCounter(int counter){
       this.counter = counter;

    }
    public  void count(){
        counter++;
    }
}