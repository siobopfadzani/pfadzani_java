package Exam_Nesting.Question10;
interface Animal
{
    default void sound()
    {
        System.out.println("Animal Sound");
    }
}

interface Mammal
{
    default void sound()
    {
        System.out.println("Mammal Sound");
    }
}
class Dog implements Animal,Mammal
{
    public void sound()
    {
        Animal.super.sound();
        Mammal.super.sound();
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
    
}
