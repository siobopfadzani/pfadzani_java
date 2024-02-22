/**The main class */
public class NamesMain4
{
    /**method level javadoc */
    public static void main(String[]args)
    {
        /**call methods and objects */
        String name = Prompter.prompter("what is your name ");
        GetName Name = new GetName();

        String surname = Prompter.prompter("what is your surname ");
        GetSurname Surname = new GetSurname();

        String age = Prompter.prompter("what is your Age ");
        GetAge Age = new GetAge();
        /**print out of the values*/
        System.out.println("hello  " + Name.getName(name)+ "  " + Surname.getSurname(surname));
        System.out.println("you are " + Age.getAge(age));

    }

}