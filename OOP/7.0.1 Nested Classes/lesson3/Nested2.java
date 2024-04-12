public class Nested2 
{
	static class Inner
    {
        
        public Inner()
        {
            System.out.println("hello i am constructing ...");
        }

        enum Level 
        {
            LOW,
            MEDIUM,
            HIGH
        }
		
	}
}
