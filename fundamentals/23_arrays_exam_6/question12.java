public class Q12{
    
     static boolean b = true;
     static int[] ia = new int[1];
     static char ch;
     static boolean[] ba = new boolean[1];
     public static void main(String args[])throws Exception{
        boolean x = false;
        if (b)
        {
          x = (ch==ia[ch]); // compares ia[ch] which is 0, and ch gets converted to 0 as its bieng compared with an int 
        }
        else x =(ba[ch]=b);
        System.out.println(x+""+ba[ch]);
     } 
}
