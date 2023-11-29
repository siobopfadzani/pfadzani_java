package usermanagement;
public class UserDAO 
{
	    
    public static void AddUser(String name, String surname, String email, String dob, String id) 
    {

     // prompting user details
        
        String Name = Prompter.Prompt("Enter your name");
        String Surname = Prompter.Prompt("Enter your surname");
        String Email = Prompter.Prompt("What is your email address");
        String Date_of_birth = Prompter.Prompt("What is your birth date? Format (DD/MM/YYYY)");
        String year = Date_of_birth.split("/")[2];
        
        double age = Double.parseDouble(year);
        double caluculatedAge = AgeCaluculator.caluculateAge(age);
        
        System.out.println("Hello "+Name+" "+Surname+" ");
        System.out.println("you are "+ caluculatedAge +" years old");

       
    }

    public static void update(String name, String surname, String email, String dob, String id) 
    {
   
    }

    public static void getUserByEmail(String Email) 
    {
    
    }

    public static void delete(String email) 
    {

    }

    public static String[] findAll() 
    {
      
        return new String[0]; 
    }
}
