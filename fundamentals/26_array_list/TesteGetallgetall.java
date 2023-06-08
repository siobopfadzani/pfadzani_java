import java.util.ArrayList;
import java.util.List;

public class Get {
    public Get() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("oranges");
        fruits.add("strawberry");
    }

    public static void main(String[] args) {
        Get get = new Get();
        List<String> allFruits = get.getAll();
        System.out.println(allFruits);
    }

    public List<String> getAll() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("oranges");
        fruits.add("strawberry");
        return fruits;
    }
}

