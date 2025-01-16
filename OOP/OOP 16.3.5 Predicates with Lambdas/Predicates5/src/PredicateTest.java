import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest
{
    public static void main(String[]args)
    {
      List <Integer> number = new ArrayList<Integer>(Arrays.asList(11,233,30,50,60,70,77,90));

        Predicate <Integer> valuePredicate = a -> a <30;
        Predicate <Integer> valuePredicate2 = a -> a > 60;

        Predicate <Integer> comparePredicates = valuePredicate.or(valuePredicate2);
        number.removeIf(comparePredicates);
        System.out.println(number);

    }
}