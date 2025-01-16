package Exam2.Question21;

public class TestQ {
    Integer i1 =1;
    Integer i2 = new Integer(1);
    int i3 = 1;
    Byte b1 = 1;
    Long g1 = 1L;
    

    public static void main(String[] args) {
        TestQ Q = new TestQ();
        Boolean test = Q.i3 == Q.i2;
        System.out.println(test);
    }
}
