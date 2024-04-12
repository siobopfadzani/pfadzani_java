import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class get {

public get () {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("oranges");
        fruits.add("strawberry");
        
      
        String fruit1 = fruits.get(0);
        System.out.println("first fruit: " + fruit1);
        
        String fruit2 = fruits.get(3);
        System.out.println("fourth fruit : " + fruit2);

        }
        
        public static void main(String[]args){
         get getname = new get();
     
    }
}
