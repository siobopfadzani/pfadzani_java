import java.util.*;
public class Q24 {
    public static void main(String[] args) {
        Set<Animal> animals = new HashSet<Animal>(); 
        
        animals.add(new Animal());
        Set<Animal> calCow = new HashSet<Animal>();
        Set<Object> wisCow = new HashSet<Object>();
        talkingAnimals(animals);
        talkingAnimals(calCow);
        talkingAnimals(wisCow);

        System.out.println(animals.contains(0));

        ArrayList aa = new ArrayList<>();
        aa.addAll(0, animals);
        System.out.println(aa);
    }
    public static void talkingAnimals(Set<? extends Object> set)
    {
        System.out.println("The animal talk! ");
    }
    
}
class Animal {}
class Cow extends Animal{}
