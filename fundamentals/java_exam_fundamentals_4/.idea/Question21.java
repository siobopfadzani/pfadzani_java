public class Question21 {
    public static void main(String[]args)
    {
        String a = "javachamp";
        String b = "javachamp";
        String c = new String("javachamp");
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b.equals(c));
        System.out.println(b.equals(a));
    }
}
