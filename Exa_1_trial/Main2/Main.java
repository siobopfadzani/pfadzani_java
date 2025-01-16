package Main2;

public class Main{
    public static void main(String[] argv){
         StringBuilder sb = new StringBuilder("java2s.com");
         sb.insert(7, "-");                   
         sb.insert(0, "-");                   
         sb.insert(4, "-");                   
         System.out.println(sb); 


         StringBuilder sbc = new StringBuilder("abcdef");
         sbc.delete(1, 3);
         System.out.println(sbc);
    }
 }