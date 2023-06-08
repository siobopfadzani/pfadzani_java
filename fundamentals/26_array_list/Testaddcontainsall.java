import java.util.ArrayList;
import java.util.Arrays;

public class Add {
    public Add() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("strawberry");

        ArrayList<String> checkFruits = new ArrayList<>();
        checkFruits.add("banana");
        checkFruits.add("orange");

        boolean containsAllFruits = fruits.containsAll(checkFruits);

        System.out.println("Does the list contain all the fruits? " + containsAllFruits);
    }

    public static void main(String[] args) {
        Add addFruits = new Add();
    }
}

