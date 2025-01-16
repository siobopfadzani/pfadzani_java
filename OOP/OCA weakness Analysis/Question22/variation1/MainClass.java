package Question22.variation1;

public class MainClass {
    public static void main(String[] args) {
        Test test = new Test();
        test.setValue(0);
        System.out.println(test.getValue());
    }
    
}
class Test
{
    private int value1 = 100;

    public void setValue(int value1)
    {
        value1 = value1;
    }
    public int getValue()
    {
        return value1;
    }
}
