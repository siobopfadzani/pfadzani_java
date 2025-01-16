package Exam8.Question37;

import java.util.* ;
public class ListTest{
   public static void main(String args[]){
      List s1 = new ArrayList( );
      s1.add("a");
      s1.add("b");
      s1.add(1, "c");
      List s2 = new ArrayList(  s1.subList(1, 3) );
      s1.add(s2);
      System.out.println(s1);


      Object t = new Integer(107);
      int k = ((Integer) t).intValue()/9;
      System.out.println(k);
   }
   
}