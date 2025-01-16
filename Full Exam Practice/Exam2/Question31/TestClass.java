package Exam2.Question31;
class Doll
{
    String name;
    Doll(String nm)
    {
        this.name = nm;
    }
}
class Barbie extends Doll{
    Barbie()
    {
        super("un");
        
    }
    Barbie(String nm)
    {
        super(nm);
    }
}
public class TestClass {
    public static void main(String[] args) {
        Barbie b = new Barbie("mydoll");
    }
    
}
