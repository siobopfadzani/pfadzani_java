import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));

        Iterator<Integer> itr = list.iterator();

        for (Integer a : list)
        {
            System.out.println(" number  " + itr.next());
        }
    }
    
}
