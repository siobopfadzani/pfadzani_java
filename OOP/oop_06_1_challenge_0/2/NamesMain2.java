public class NamesMain2
{
    public static void main(String[]args)
    {
        AgeGetter2 age = new AgeGetter2();
        NameGetter2 name = new NameGetter2();
        SurnameGetter2 surname = new SurnameGetter2();
        
        System.out.println("hello " + name.getName() + " " + surname.getSurname());
        System.out.println("you are " + age.getAge() + " years old ");
    }

}