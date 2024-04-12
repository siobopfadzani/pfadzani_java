import java.util.Iterator;
import java.util.Vector;

public class Add {
    public Add() {
        Vector<String> vector = new Vector<>();
        vector.add("mac");
        vector.add("mecer");
        vector.add("HP");

        Iterator<String> iterator = vector.iterator();
        if (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }else {
            System.out.println("end of code");
        }
    }

    public static void main(String[] args) {
        Add GetName = new Add();
    }
}

