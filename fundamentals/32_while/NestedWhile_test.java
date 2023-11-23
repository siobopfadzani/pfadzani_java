public class NestedWhile {
    public static void main(String[] args) {  

        for(int i = 0;i<5;i++){
        
            System.out.println("Outer = "+i);

            for( i = 0;i<5;i++)
            {
                System.out.println(" Inner = "+i);
            }           
        }
    }
}
