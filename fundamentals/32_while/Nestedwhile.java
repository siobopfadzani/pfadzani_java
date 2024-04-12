public class NestedWhile {
    public static void main(String[] args) {  
        int i = 0;
        while (i < 5)
        {
            System.out.println("Outer = "+i);
            while(i<5)
            {
            System.out.println("inner = "+i);
             i++;
            }
            i++;
        }
    }
}
