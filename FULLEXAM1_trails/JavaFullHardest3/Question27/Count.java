package Question27;

public class Count {
    public int count(boolean b, boolean...b2)
    {
        return b2.length;
    }
    public static void main(String[] args) {
        Count c = new Count();
        System.out.println(c.count(true, true,true));
    }
    
}
