import java.util.Vector;

public class Add {
    public Add() {
        Vector<String> vector = new Vector<>();
        vector.add("mac");
        vector.add("mecer");
        vector.add("HP");

        Object[] array = vector.toArray();

        for (int i = 0; i < array.length; i++) {
            String element = (String) array[i];
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Add addObj = new Add();
    }
}

