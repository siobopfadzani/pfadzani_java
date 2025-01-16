package Q6;

public class Trevor extends Singer{
    public static String sing()
    {
        return "fa";
    }
    public static void main(String[] args) {
        Trevor trevor = new Trevor();
        Singer singer = new Trevor();

        System.out.println(trevor.sing()+ "   "+ singer.sing());
    }
}