package usermanagement;
import java.util.Scanner;

public class MenuPrinter

{
	public static void print()
	{
		UserDAO user_DAO = new UserDAO();

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
				  user_DAO.AddUser( name,  surname,  email,  dob,  id);
				  break;

				case 2:
				  user_DAO.delete(email);
				  break;

				case 3:
				  user_DAO.update( name,  surname,  email,  dob,  id);
				  break;

				case 4:
				  user_DAO.getUserByEmail(Email);
				  break;

				case 5:
				  System.out.println("code Exiting");
			  	  return;

				default:
				  System.out.println("Invalid choice");
				  break;
				  

			}
		}
}	
	
