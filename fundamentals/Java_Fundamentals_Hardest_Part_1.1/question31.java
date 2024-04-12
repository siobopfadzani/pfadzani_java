public class question31 {
    public static void main(String[]args)
    {
        int result =1 + 2;
        
        int original_result =result;

        result =result-2;
        original_result =result;

        result = result*4;
        original_result =result;
       
        result = result/5;
 
        original_result=result;
        result=result+10;
        
        original_result = result;
        result = result%8;

        System.out.println(original_result+result);

      
    }
    
}
