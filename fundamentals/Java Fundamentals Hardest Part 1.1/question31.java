public class question31 {
    public static void main(String[]args)
    {
        int result =1 + 2;
        System.out.println(result);
        int original_result =result;

        result =result-1;

        System.out.println(original_result + result);
        original_result =result;

        result = result*2;
        System.out.println(original_result+result);
        original_result =result;

        result = result/2;

        System.out.println(original_result +result);
        original_result=result;

        result=result+8;

        System.out.println(original_result+result);
        original_result = result;

        result = result%7;
        System.out.println(original_result+result);
      
    }
    
}
