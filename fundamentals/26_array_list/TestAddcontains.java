import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Add{

public Add () {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("oranges");
        fruits.add("strawberry");
        
       boolean Containsfruit = fruits.contains("banana");
              boolean Containsfruit2 = fruits.contains("oranges ");
        
        System.out.println("does this code contain bananas: " + Containsfruit);
                System.out.println("does this code contain oranges: " + Containsfruit2);



        }
        
        public static void main(String[]args){
         Add getname = new Add();
     
    }
}
