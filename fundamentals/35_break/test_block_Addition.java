public class BlockTest1 {
    public static void main(String[] args) {
       int total;
       int sum;
        {
           int i =1;
           System.out.println("Block 1 i = "+ i);
            sum = i + 0;
        }
       
        {
            int i =1;
            System.out.println("Block 2 i = "+ i);   
            total = i +0;         
        }
       int result = total +sum;
      System.out.println(" addition result  = " + result);   


    }
}
