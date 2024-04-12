public class Garbage
{
    String name ;

    public Garbage(String paramName)
    {
         name = paramName;
    }
    protected void finalize()
    {
        System.out.println("Finalize just before garbage collection");
    }

}
