public class SubClass {
    public int getNumber(int a){return 4;}
    public static void main(String[] args) {
        System.out.println(new SubClass().getNumber(4));
    }
}
class Super 
{
    public int getNumber(int a)
    {
        return 2;
    }
}
