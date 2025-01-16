package Exam1.Question2;

class Person {
    String name;
    
    Person(String name) {
        this.name = name;
    }
    
    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj) return true; // Reference equality
    //     if (!(obj instanceof Person)) return false; // Type check
    //     Person other = (Person) obj; // Cast
    //     return this.name.equals(other.name); // Value equality
    // }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        Person p2 = new Person("Alice");
        
        System.out.println(p1 == p2); // false, different references
        System.out.println(p1.equals(p2)); // true, same name
    }
}
