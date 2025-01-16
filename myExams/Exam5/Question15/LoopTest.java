package Exam5.Question15;

public class LoopTest {
    int k = 5;
    public boolean CheckIt(int k)
    {
        return k-- > 0 ?true:false;
    }
    public void printThem()
    {
        while(CheckIt(k))
        {
            System.out.println(k--);
        }
    }
    public static void main(String[] args) {
        new LoopTest().printThem();
    }
}
