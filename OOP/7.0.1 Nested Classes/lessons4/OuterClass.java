public class OuterClass
{
    public class InnerClass
    {
        
        public InnerClass()
        {
            System.out.println("constructing inner");
            
        }

    }
    public OuterClass()
    {

        System.out.println("constructing outer");
    }
}
