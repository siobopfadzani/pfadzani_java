package UNIQUE.Question2;

public class TestClass {
    public static void main(String[] args) {
        String ta = "A ";
        ta = ta.concat("b ");
        String tb = "c ";
        ta = ta.concat(tb);
        ta  =ta.replace('c', 'd');
        ta = ta.concat(tb);
        System.out.println(ta);
    }
    
}
