package NestingExam2.Questoin59;

public class TestClass {
    public static void main(String[] args) {
        Data d1 = new Data(10);
        d1.strval = "d1";
        Data d2 = d1;
        d2.intval = 20;
        System.out.println("d2 val " + d2.strval);
    }
    
}
class Data
{
    int intval = 0;
    String strval = "default";
    public Data(int k)
    {
        this.intval = k;
    }
}