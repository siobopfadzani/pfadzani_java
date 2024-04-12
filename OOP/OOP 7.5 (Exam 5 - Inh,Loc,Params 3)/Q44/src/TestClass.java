public class TestClass
{
    void probe(int... x) {System.out.println("in ...");}
    void probe(Integer x) {System.out.println("in Integer...");}
    void probe(long... x) {System.out.println("in long");}
    void probe(Long x) {System.out.println("in Long ");}

    public static void main(String[]args)
    {
        Integer a = 4;
        new TestClass().probe(a);
        int b = 4;
        new TestClass().probe(b);
    }
}
