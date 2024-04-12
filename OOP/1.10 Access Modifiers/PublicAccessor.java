public class PublicAccessor 
{
    public String getProperty()
    {
        AccessMe acces = new AccessMe();
        return acces.getName();
    }
    
}
