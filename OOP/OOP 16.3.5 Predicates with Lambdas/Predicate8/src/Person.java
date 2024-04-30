import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Person {
    private String name;
    private String surname;
    private int age;
    private Gender gender;
    private City city;

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public int getAge() { return age; }
    public Gender getGender() { return gender; }
    public City getCity() { return city; }

    public enum Gender {
        MALE,
        FEMALE
    }

    public enum City {
        JOHANNESBURG,
        PRETORIA,
        CAPETOWN
    }

    public Person(String name, String surname, int age, Gender gender, City city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.city = city;
    }

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("pfadzani", "siobo", 32, Gender.FEMALE, City.JOHANNESBURG),
                new Person("maria", "tshishonga", 60, Gender.MALE, City.PRETORIA),
                new Person("moses", "matene", 70, Gender.FEMALE, City.CAPETOWN),
                new Person("ronald", "mavu", 20, Gender.MALE, City.PRETORIA)
        ));

        Stream<Person> checkGenderAndAge = persons.stream()
                .filter(a -> (a.getAge() > 50 || a.getGender() != Gender.MALE))
                .filter(a -> a.getCity() != City.JOHANNESBURG);

        checkGenderAndAge.forEach(person -> System.out.println("name: " + person.getName() + ", surname: " +
                person.getSurname() + ", age: " + person.getAge() + ", gender: " + person.getGender() +
                ", city: " + person.getCity()));
    }
}
