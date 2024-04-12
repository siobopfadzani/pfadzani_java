public class ToStringOverride
{
    String  []arr = new String[10];

    public static void main(String[]args)
    {
        ToStringOverride to = new ToStringOverride();
        System.out.println(to);
    }
    public String toString()
    {
        int i;
        for (i =0; arr.length < 10; i++)
        {
            arr[i] = "hello";
        }
        return "hello" + arr;
    }

}
