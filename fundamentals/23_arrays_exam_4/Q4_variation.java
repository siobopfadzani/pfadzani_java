public class Arraycopy1 {
    public static void main(String[] args) 
    {
 	int [] y = new int[30];
 	m(y);
 	System.out.println(y[0]); 
    }
   
    public static void m (int[] numbers)
    {
       numbers[0] = 5555;
       numbers[0] = 10;
  
    }
}


