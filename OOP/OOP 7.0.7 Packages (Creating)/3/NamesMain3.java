
public class NamesMain3
{
    public static void main(String[]args)
    {
        String name = Prompter.prompter("what is your name ");
        NameGetter3 Name = new NameGetter3();
       

        String surname = Prompter.prompter("what is your surname ");
        SurnameGetter3 Surname = new SurnameGetter3();

        String age = Prompter.prompter("what is your Age ");
        AgeGetter3 Age = new AgeGetter3();

        System.out.println("hello  " + Name.getName(name)+ "  " + Surname.getSurname(surname));
        System.out.println("you are " + Age.getAge(age));

    }

}