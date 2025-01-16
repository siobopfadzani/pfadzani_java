package Lamda_functions.Lamdas2;

import java.util.ArrayList;
import java.util.List;
public class AnimalSearchTraditionsl {
    public static void main(String[] args) {
        List<Animals> animals = new ArrayList<>();
        animals.add(new Animals("fish", false, true));
        animals.add(new Animals("kangaroo", true, true));
        animals.add(new Animals("rabbit", true, true));
        animals.add(new Animals("turte", false, true));
        System.out.println("which animals can hop.......");
        print(animals, new CheckIfHopper());
        System.out.println("which ones can swim?......");
        print(animals, a ->a.canswim());
        System.out.println("can you Hop..........");
        print(animals, a ->a.canhop());


}
   private static void print(List<Animals> animals,checkTrait checker)
   {
        for (Animals animal : animals)
        {
            if(checker.test(animal)){
                System.out.println(animal +" ");
            }
        }
   } 


}
