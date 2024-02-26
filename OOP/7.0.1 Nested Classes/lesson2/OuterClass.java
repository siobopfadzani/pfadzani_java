public class OuterClass
{
    public class InnerClass
    {
        static int testInt = 10;
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
