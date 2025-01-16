package Exam_Nesting.Question15;
interface Flyable
{
    void fly();
}
class Bird implements Flyable
{
    public void fly()
    {
        System.out.println("the bird is flying");
    }
}
class Airplane implements Flyable
{
    public void fly()
    {
        System.out.println("the airplane is flying");
    }
}
public class Main {
    public static void main(String[] args) {
        Flyable [] flyingobj = {new Bird(),new Airplane()};
        for(Flyable obj:flyingobj)
        {
            obj.fly();
        }
    }
    
}
