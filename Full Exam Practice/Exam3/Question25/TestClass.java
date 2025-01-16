package Exam3.Question25;

public class TestClass {
    static class Wrapper 
    {
        int w = 10;
    }
    static Wrapper changWrapper(Wrapper w)
    {
        w = new Wrapper();
        w.w +=9;
        return w;
    }
    public static void main(String[] args) {
        Wrapper w = new Wrapper();
        w.w = 20;
        changWrapper(w);
        w.w +=30;
        System.out.println(w.w);
        w = changWrapper(w);
        System.out.println(w.w);
    }
    
}
