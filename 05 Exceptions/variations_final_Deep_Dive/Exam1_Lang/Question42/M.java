package Question42;

public class M {
    public void method(Object o)
    {
        System.out.println("OB");
    }
    public void method(StringBuffer s)
    {
        System.out.println("SV");
    }

    public static void main(String[] args) {
        M q = new M();
        q.method(null);
    }
    
}
