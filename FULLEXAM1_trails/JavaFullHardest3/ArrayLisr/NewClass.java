package ArrayLisr;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class NewClass {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>(10); 
        ArrayList <Integer> list3 = new ArrayList<>(list2); 

        boolean b = list1.add(120);
        System.out.println(b);
        list1.add(0,10);
        Integer r = new Integer(40);
        list1.remove(r);
        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list1.isEmpty());


        List<String> listarray = new ArrayList<>();
        listarray.add("hack");
        listarray.add("null");
        System.out.println(listarray.isEmpty());



        List <Integer> li = new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        Arrays.asList(li);
        System.out.println(li);
        Collections.sort(li);
        li.forEach(a -> System.out.print(a+ " "));
    }
    
}
