import java.util.*;

public class CollectVariation {
    public static void main(String[] args) {
        Collection <String> collect = new ArrayList<>();
        collect.add("hi");
        
        for(String a: collect)
        {
            System.out.println(a);
        }

        Collection <String> collect1 = new LinkedHashSet<>();
        collect1.add("hi");

        for(String a: collect1)
        {
            System.out.println(a);
        }

        Collection <String> collect2 = new LinkedList<>();
        collect2.add("hi");
        for(String a: collect2)
        {
            System.out.println(a);
        }

        Collection <String> collect3 = new Vector<>();
        collect3.add("hi");
        for(String a: collect3)
        {
            System.out.println(a);
        }

        //doesnt compile 
         
        Map <Integer,String> collect4 = new HashMap<Integer,String>();
        collect4.put(0, "hi");

        for(String a: collect)
        {
            System.out.println(collect);
        }


    }
    
}
