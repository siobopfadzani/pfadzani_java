public class Q12{
    
     static boolean b = true;
     static int[] ia = new int[1];
     static char ch;
     static boolean[] ba = new boolean[1];
     public static void main(String args[])throws Exception{
        boolean x = false;
        if (b)
        {
          x = (ch==ia[ch]);
        }
        else x =(ba[ch]=b);
        System.out.println(x+""+ba[ch]);
     } 
}
