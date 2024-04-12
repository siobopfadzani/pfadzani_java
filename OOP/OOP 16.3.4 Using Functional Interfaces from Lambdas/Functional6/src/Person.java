
import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Person {
    private Date dateOfBirth;
    private int age;
    private String name;
    private String surname;


    public Person(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = new Date();
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSurname()
    {
        return surname;
    }
    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();

        Comparator<Person> comparename = Comparator.comparing(Person::getName);

        Collections.sort(personList, comparename);
        personList.add(new Person(31, "Pfadzani", "Siobo"));
        personList.add(new Person(30, "Tshepi", "Siobo"));
        personList.add(new Person(2, "Oritonda", "Siobo"));
        Collections.sort(personList,comparename);
        for (Person person : personList) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge()+ " surname : " + person.getSurname());
        }
    }
}
