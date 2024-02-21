public class Constructor2 
{
    private String name;

    public Constructor2(String name) 
    {  
        this.name = name;
        
    }
    public Constructor2()
    {
       this.name = "peter";
       System.out.println("constructor Name: "+ name);   
    }
}
