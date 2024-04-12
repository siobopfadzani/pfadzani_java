import java.util.ArrayList;

public class Add {
    public Add() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("strawberry");

        
        String[] fruitArray = fruits.toArray(new String[0]);

        
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }
    }

    public static void main(String[] args) {
        Add addFruits = new Add();
    }
}

