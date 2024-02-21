public class Question15 {

    public static void main(String[]args)
    {
        String myStr = "123";
        long m = new Long(myStr);
        System.out.println(m);

        String myString = "123";
        long k = Long.parseLong(myString);
        System.out.println(k);

        String myString2 = "123";
        long l = Long.valueOf(myString2).longValue();
        System.out.println(k);
    }
    
}
