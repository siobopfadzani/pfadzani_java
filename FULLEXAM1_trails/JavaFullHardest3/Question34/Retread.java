package Question34;
class MyException extends Exception{}
class Tire
{
    void dostuff(){}
}
public class Retread extends Tire{
    public static void main(String[] args) {
        new Retread().dostuff();
    }
    // void dostuff()
    // {

    // }
    // void dostuff()throws MyException
    // {
    //     System.out.println(7/0);
    // }
    // void dostuff() throws RuntimeException
    // {

    // }
    void dostuff() throws ArithmeticException
    {

    }
    
}
