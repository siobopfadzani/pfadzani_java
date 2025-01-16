package Question34;

public class Question34
{
    public static void main(String[] args) {
        String s = "SanchinTendulkar";
        System.out.println(s.substring(6));
        System.out.println(s.substring(0,6));
        StringBuffer sb = new StringBuffer("hello");
        sb.delete(1, 3);
        System.out.println(sb);
        StringBuffer sc = new StringBuffer();
        System.out.println(sb.capacity());
        sc.append("Hello");
        System.out.println(sc.capacity());
        sc.append("java is my favourite language");
        System.out.println(sc.capacity());
    }
}