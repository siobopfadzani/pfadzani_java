import java.lang.Object;
import java.util.Iterator;
import java.util.ArrayList;

public class TestIterator{
    public TestIterator(){
      ArrayList <String> list= new ArrayList<>();
      
      list.add("first");
      list.add("second");
      list.add("third");
      list.add("fourth");
      list.add("fifth");
      
      Iterator <String> iterator = list.iterator();
      
      while(iterator.hasNext()){
      boolean element = iterator.hasNext();
      System.out.println(list);
      if (iterator.equals("fourth")){
      
         iterator.remove();
      }
    }
      
   }
   public static void main(String[]args){

      new TestIterator();
   }
}
