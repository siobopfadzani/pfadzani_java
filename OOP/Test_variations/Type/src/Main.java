// Defining a user-defined datatype called Person
class Person {
    // Fields
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects of the Person class
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Alice", 25);

        // Displaying information about the persons
        System.out.println("Person 1:");
        person1.displayInfo();

        System.out.println("\nPerson 2:");
        person2.displayInfo();
    }
}
