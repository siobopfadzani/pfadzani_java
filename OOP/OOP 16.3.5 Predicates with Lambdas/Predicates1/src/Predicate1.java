import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Predicate1 {
    public static void main(String[] args) {
        List<Integer> numbers =
                new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        numbers.removeIf(e -> e > 5);
        System.out.println(numbers);
    }
}
