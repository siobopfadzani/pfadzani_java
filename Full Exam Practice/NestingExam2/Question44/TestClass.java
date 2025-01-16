package NestingExam2.Question44;

public class TestClass {
    static int x = 5;
    int getx(){return x;}
    public static void main(String[] args) throws Exception{
        TestClass tc = new TestClass();
        tc.looper();
        System.out.println();
        System.out.println(tc.x);
        int a = 0;
        int f = 10;
    }
    public void  looper()
    {
        int x = 0;
        while ((x = getx()) !=0) {
            for(int m = 10;m >=0;m--)
            {
                x = m;
            }
        }
    }
}
