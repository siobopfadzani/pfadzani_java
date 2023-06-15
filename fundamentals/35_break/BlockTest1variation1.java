public class BlockTest1 {
    public static void main(String[] args) {
       int sum=0;
        {
           int i =2;
           System.out.println("Block 1 i = "+ i);
           sum+=i;
        }
       
        {
            int i =2;
            System.out.println("Block 2 i = "+ i); 
            sum+=i;           
        }
        	
       System.out.println("sum of the two variables "+ sum);
    }
}

