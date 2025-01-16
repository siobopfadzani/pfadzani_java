package Exam5.Question53;
abstract class Vehicle
{
    abstract void start();
    class Engine{
        void rev()
        {
            System.out.println("engine revving");
        }
    }
   
}
class Car extends Vehicle
{
    private int year;
    Car(int year)
    {
        
        this.year = year;
    }
    @Override
    void start()
    {
        System.out.println("car starting");
        Engine engine = new Engine();
        engine.rev();
    }
    static class wheel
    {
        void rotate(){        
            System.out.println("car starting");
            
         }
    }
    void drive()
    {
        class steeringWheel
        {
            void turn()
            {
                System.out.println("steering wheel turning");
            }
        }
        steeringWheel wheel = new steeringWheel();
        wheel.turn();
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car(2023);
        car.start();
        // car.drive();
    }
    
}
