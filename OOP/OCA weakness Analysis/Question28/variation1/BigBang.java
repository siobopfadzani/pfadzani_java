package Question28.variation1;
abstract class Bang 
{
    abstract void f();
    final void g(){}
    void h(){}
    protected static int i;
    private int j;
}
final class BigBang extends Bang{
    void f(){}
    public static void main(String[] args) {
        Bang bang = new BigBang();
        Bang.i =10;
        i ++;
        System.out.println(i);
    }
    

}
