public class NestedDoWhile {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        
        do {
            System.out.println("Outer = " + i);
            
            do {
                System.out.println(" Inner = " + j);
                j++;
            } while (j < 5);
            
            i++;
            j = 0; 
        } while (i < 5);
    }
}

