package Exam5.Question40;
abstract class Animal
{
    abstract void makesound();
    void move(){System.out.println("animals moves");}
}
class Dog extends Animal
{
    void makesound(){System.out.println("dog barks");}
    @Override
    void move()
    {
        super.move();
        System.out.println("dogs run");
    }
    void fetch(String item){System.out.println("dog fetches "+item);}
    void fetch(String item,int times){System.out.println("dog fetches "+ item + " "+times+ " times");}
}
class Cat extends Animal
{
    @Override
    void makesound(){System.out.println("cats meows");}
}
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makesound();
        animal2.makesound();
        animal1.move();

        Dog dog = (Dog)animal1;
        dog.fetch("ball");
        dog.fetch("stick",3);

    }
    
}
