

import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Person2 {
    private Date dateOfBirth;
    private int age;
    private String name;
    private String surname;




    public Person2(int age, String name, String surname) {
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
        ArrayList<Person2> personList = new ArrayList<Person2>();
        personList.add(new Person2(31, "Pfadzani", "Siobo"));
        personList.add(new Person2(30, "Tshepi", "Siobo"));
        personList.add(new Person2(2, "Oritonda", "Siobo"));
        Comparator<Person2> compareByName = (p1, p2) -> p2.getName().compareTo(p1.getName());
        Collections.sort(personList, compareByName.reversed());

        for (Person2 person : personList) {
            System.out.println("Name: " +  person.getName()+ ", Age: " + person.getAge()+ " surname : " + person.getSurname());
        }
    }
}
