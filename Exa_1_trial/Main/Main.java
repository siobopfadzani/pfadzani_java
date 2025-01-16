package Main;

public class Main{
    public static void main(String[] argv){
 
         String string = "1234567890"; 
         System.out.println(string.substring(3));  
         System.out.println(string.substring(string.indexOf('0')));
         System.out.println(string.substring(3, 4)); 
         System.out.println(string.substring(3, 7)); 

         StringBuilder by = new StringBuilder("hello");
         String bye = new String("hello");

         boolean b = by == by;
    }
 }