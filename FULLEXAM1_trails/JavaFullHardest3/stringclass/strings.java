package stringclass;

public class strings 
{
   static String a = "banana";
    static String b = "banana";
    public static void main(String[] args) {
        System.out.println(a == b);


        String x1 = "bann";
        String x2 =  "bann.".trim();
        System.out.println(x1 == x2);

        String x = "bann";
        String xx = new String("bann");
        System.out.println(x == xx);
    }
    
}
