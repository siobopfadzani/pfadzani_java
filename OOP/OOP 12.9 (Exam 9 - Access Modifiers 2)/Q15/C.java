package Q15;

public class C extends B{
    int i = Math.round(3.5f);
    public static void main(String[] args) {
        B a =  new C();
        a.print();
    }
    void print()
    {
        System.out.println(i);
    }
}
