

import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Person3 {
    private Date dateOfBirth;
    private int age;
    private String name;
    private String surname;
    private  String dayToNextBirthDay;




    public Person3(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = new Date();
        this.dayToNextBirthDay = String.valueOf(dateOfBirth);
    }
    public String getDayToNextBirthDay() {return  dayToNextBirthDay;}
    public String getName() {return name;}
    public int getAge() {
        return age;
    }
    public String getSurname() {return surname;}
    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }
    public static void main(String[] args) {
        ArrayList<Person3> personList = new ArrayList<Person3>();
        personList.add(new Person3(31, "Pfadzani", "Siobo1"));
        personList.add(new Person3(30, "Tshepi", "Siobo2"));
        personList.add(new Person3(2, "Oritonda", "Siobo3"));
        Comparator<Person3> compareByName = (p1, p2) -> p2.getSurname().compareTo(p1.getSurname());
        Collections.sort(personList, compareByName);

        for (Person3 person : personList) {
            System.out.println("Name: " +  person.getName()+ ", Age: " + person.getAge()+ " surname : " + person.getSurname());
        }


    }
}
