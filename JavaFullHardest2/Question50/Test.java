package Question50;

 class Acc {
    int p;
    private int q;
    protected int r;
    public int s;
    
}
public class Test extends Acc{
    public static void main(String[] args) {
        Acc obj = new Test();
        System.out.println(obj.s);
        System.out.println(obj.r);
    }
}