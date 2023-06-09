import java.util.Vector;

public class Add {
    public Add() {
        Vector<String> vector = new Vector<>();
        vector.add("mac");
        vector.add("mecer");
        vector.add("HP");
        
        Vector<String> vector2 = new Vector<>();
        
        vector2.add("mac");
        vector2.add("HP");
        
        if (vector2.containsAll(vector)) {
            System.out.println("The same elements exist in both vector and vector2");
        } else {
            System.out.println("this are the values on vector2  "+vector2);
        }
    }
    
    public static void main(String[] args) {
        Add addObj = new Add();
    }
}

