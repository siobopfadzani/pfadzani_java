public class Garbage
{
    String name ;
    public Garbage(String paramName)
    {
         name = paramName;
    }

    protected void finalize() throws Throwable
    {
        System.out.println("Finalize just before garbage collection");
        
    }
}
