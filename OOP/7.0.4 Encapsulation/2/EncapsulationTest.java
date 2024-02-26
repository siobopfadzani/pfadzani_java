public class EncapsulationTest {

    private int value1;
    private int value2;

    public int getValue1() {
        return value1;
    }
    public int setValue1(int val1)
    {
        this.value1 = val1;
        return val1;
    }

    public int getValue2(){
        return  value2 + value1;
    }
    public int setValue2(int val2)
    {
        this.value2 = val2;
        return val2 * 2;
    }


}
