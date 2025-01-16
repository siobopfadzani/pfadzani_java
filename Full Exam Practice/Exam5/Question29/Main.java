package Exam5.Question29;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Animal
{
    protected String name;
    protected int age;
    {
        System.out.println("animal instance initializer");
    }
    public Animal()
    {
        this("unknown");
        System.out.println("animal no-args constructor ");
    }
    public Animal(String name)
    {
        this(name,0);
        System.out.println("animal single args constructor");
    }
    public Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("animal two args constructor");
    }
}
class Dog extends Animal{
    private String breed;
    {
        System.out.println("dog instance initializer");
    }
    public Dog()
    {
        super();
        this.breed = "mixed";
        System.out.println("Dog no-args construct");
    }
    public Dog(String name, int age,String breed)
    {
        super(name,age);
        this.breed = breed;
        System.out.println("dog three args construct");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println("......");
        Dog dog2 = new Dog("buddy",3,"Lab");

    }
    
}
