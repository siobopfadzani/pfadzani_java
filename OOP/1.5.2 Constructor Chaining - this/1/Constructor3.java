public class Constructor3 
{
    public Constructor3()
    {

   	 System.out.println("Running no-args constructor");

    }
    
    public Constructor3(String name, String surname)
    {

   	 this();
   	 System.out.println("Running name arg constructor: Name ="+ name + " Surname = "+ surname);

    }
    public Constructor3(String name, String surname, String jobDescription)
    {
      this();
   	  System.out.println("peter is a : "+ jobDescription);

    }
}


