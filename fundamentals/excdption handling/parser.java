public class parser
{
    public static void main(String []args)
    {
        try
        {
          int i = 0;
          i =Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e)
        {
            System.out.println("problem" + i);
        }
    }
}