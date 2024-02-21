public class Constructor3 {
    public Constructor3()
    {
   	 System.out.println("Running no-args constructor");
    }
    
    public Constructor3(String name, String surname)
    {
   	    this();
   	    System.out.println("Running name arg constructor: Name = "+name+ " surname = " + surname);
    }

    public Constructor3(String name,String surname, String jobDiscription)
    {
        this(name,surname);
        System.out.println("running 3 args constructor "+ name + " suname = " + surname + " job discription " + jobDiscription);
    }
}
