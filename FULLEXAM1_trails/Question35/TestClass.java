package Question35;

import Question11.a.A;

class a{

}
class AA extends A{

  

}
public class TestClass {
    public static void main(String[] args) {
        A a = new AA();
        AA aa = new AA();
        a = aa;
        // System.out.println("a = " +  );
    }
    
}
