package usermanagement;
import java.util.Scanner;

public class MenuPrinter

{
	public static void print()
	{
		while (true) {
		String name,  surname, email, dob,id;
		 System.out.println(" choose from the list below ");
		 System.out.println("1. Add a user ");
		 System.out.println("2. Delete a user");
		 System.out.println("3. Update a user ");
		 System.out.println("4. List a user ");
		 System.out.println("5. EXIT ");
		 
		 int choice = Integer.parseInt(Prompter.Prompt("Enter choice"));
		
		
		
			switch (choice)
			{
				case 1:

				name = Prompter.Prompt("enter your name");
				surname = Prompter.Prompt("enter your surname");
				email = Prompter.Prompt("enter your email");
				dob = Prompter.Prompt("enter your ID");
				id = Prompter.Prompt("enter you Date of birth");
				UserDOA.createUser(name,surname,email,dob,id);
				  break;
				case 2:
				email = Prompter.Prompt("enter email of account to be deleted");
				UserDOA.deleteUser(email);
				  break;

				case 3:
				name = Prompter.Prompt("enter your name");
				surname = Prompter.Prompt("enter your surname");
				email = Prompter.Prompt("enter your email");
				dob = Prompter.Prompt("enter your ID");
				id = Prompter.Prompt("enter you Date of birth");
				UserDOA.updateUser(name, surname, email, dob,id);
				  break;

				case 4:

				email = Prompter.Prompt("enter email to be retrieved");
				UserDOA.getUserByEmail(email);
				  break;

				case 5:
				  System.out.println("code Exiting");
			  	  return;

				default:
				  System.out.println("Invalid choice entered");
				  break;
				}  
			}
		}
}	
	
