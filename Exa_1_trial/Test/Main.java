package Test;

public class Main{
    public static void main(String[] argv){
 
         String x = "Hello World"; 
         String z = "Hello World".trim(); 
         String a = new String("Hello World");
         System.out.println(x == z); // false 
         System.out.println(a.equals(x));


         StringBuilder sb = new StringBuilder(50); 
         sb.append("AAA").insert(1, "BB");
         sb.insert(6, "CCCC"); 


         System.out.println(sb); 
    }
 }