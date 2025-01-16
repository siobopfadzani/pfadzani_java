package Q30;

public class TestClass {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        int a [] ={1,2};
        a[y]=y=30;
        for (int i : a) {
            System.out.println(y);
        }
    }
    
}
