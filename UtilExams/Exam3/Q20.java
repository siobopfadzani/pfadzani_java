
import java.util.ArrayList;
public class Q20 {
    public static void main(String[] args) 
    {
      // comparison of the same arrayList
      ArrayList<String> array1 = new ArrayList<String>();
      array1.add("hello");

      ArrayList<String> array2 = new ArrayList<String>();
      array2.add("hello");
      System.out.println(array1.hashCode() == array2.hashCode());

      // comparison of two different ArrayLists 
      ArrayList<String> array3 = new ArrayList<String>();
      array3.add("hello");

      ArrayList<String> array4 = new ArrayList<String>();
      array4.add("hello");
      array4.add("hi");
      System.out.println(array3.hashCode() == array4.hashCode());


    }
    
}
