package usermanagement;
import java.util.Scanner;

public class MenuPrinter

{
	public static void print()
	{
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
				  UserDAO.AddUser( name,  surname,  email,  dob,  id);
				  break;

				case 2:
				  UserDAO.delete(email);
				  break;

				case 3:
				  UserDAO.update( name,  surname,  email,  dob,  id);
				  break;

				case 4:
				  UserDAO.getUserByEmail();
				  break;

				case 5:
				  System.out.println("");
			  	  return;

				default:
				  System.out.println("Invalid choice");
				  

			}
		}
}	
	
