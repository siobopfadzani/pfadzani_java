package functional5;
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
        Comparator <Person> compare = new Comparator<>() {
            @Override
            public int compare(Person arg0, Person arg1) {
                if(arg0.age == arg1.age)
                {
                    return 0;
                }
                else if(arg0.age > arg1.age )
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        };
        personList.add(new Person(31, "Pfadzani", "Siobo"));
        personList.add(new Person(30, "Tshepi", "Siobo"));
        personList.add(new Person(1, "Oritonda", "Siobo"));
        Collections.sort(personList,compare);
        for (Person person : personList) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge()+ " surname : " + person.getSurname());
        }
    }
}
