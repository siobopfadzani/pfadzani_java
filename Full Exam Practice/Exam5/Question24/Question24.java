package Exam5.Question24;
import java.util.*;
public class Question24 {
    static List s1 = new ArrayList();
    public static void main(String[] args) {
        s1.add("a");
        s1.add("b");
        s1.add(("c"));
        s1.add("a");
        System.out.println(s1.remove("a")+ " "+ s1.remove("x"));
    }
    
}
