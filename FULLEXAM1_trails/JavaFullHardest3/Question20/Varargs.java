package Question20;

public class Varargs {
    public void test()
    {
        test1(10);
        test1(10,20);
    }
    public static void main(String[] args) {
        new Varargs().test();

        // switch () {
        //     case value:
                
        //         break;
        
        //     default:
        //         break;
        // }
    }
    // public void test1(int i, int...j){}
    public void test1(int...i){}
    
}
