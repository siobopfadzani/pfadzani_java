
public class Question2 implements Question9 
{
    public static void main(String[] args) 
    {
        // Create an instance of Question2 or any other class implementing Question9
        Question9 instance = new Question2();

        // Call the m method on the instance and print the result
        System.out.println(instance.m());
    }
}
interface Question9 
{
    default int m() 
    	{
        	int a = 10;
        	return a;
        } 
}
