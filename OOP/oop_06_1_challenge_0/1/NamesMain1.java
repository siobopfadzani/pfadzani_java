public class NamesMain1
{
    public static void main(String[]args)
    {
        String name = NameGetter1.getName();
        String surname = SurnameGetter1.getSurname();
        int Age = AgeGetter1.getAge();

        System.out.println("hello " + name + " " + surname);
        System.out.println("you are " + Age + " years old ");
    }

}