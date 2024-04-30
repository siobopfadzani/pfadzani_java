import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Person
{
    private String name;
    private String surname;
    private int age;
    private Gender gender;
    private City city;

    public String getName() {return name;}
    public String getSurname() {return surname;}
    public int getAge(){return  age;}
    public Gender getGender(){return gender;}
    public City getCity(){return city;}

    public enum Gender
    {
        MALE,
        FEMALE;
    }
    public  enum City
    {
        JOHANNESBURG,
        PRETORIA,
        CAPETOWN;
    }
    public  Person(String name, String surname, int age, Gender gender,City city){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.city = city;
    }
    public static  void main(String[]args)
    {
        ArrayList<Person> persons = new ArrayList<Person>(Arrays.asList());

        persons.add(new Person("pfadzani","siobo",32,Gender.FEMALE,City.JOHANNESBURG));
        persons.add(new Person("maria","tshishonga",60, Gender.MALE,City.PRETORIA));
        persons.add(new Person("moses","matene",70, Gender.FEMALE,City.CAPETOWN));
        persons.add(new Person("ronald","mavu",20, Gender.MALE,City.PRETORIA));

        for(Person person: persons)
            System.out.println("name : " + person.getName()+ " surname " + person.getSurname() + " age " + person.getAge()+" gender " + person.getGender()+" city "+ person.getCity());
        System.out.println();

        Stream<Person> checkGender = persons.stream().filter(a -> a.gender != Gender.MALE);


        checkGender.forEach(person -> System.out.println("name : " + person.getName()+ " surname " + person.getSurname() + " age " + person.getAge()+" gender " + person.getGender()+" city "+ person.getCity()));

    }
}
