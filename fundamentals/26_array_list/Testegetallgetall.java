import java.util.ArrayList;

public class GetAll {

    public GetAll() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("oranges");
        fruits.add("strawberry");

        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }

    public static void main(String[] args) {
        GetAll getAll = new GetAll();
    }
}

