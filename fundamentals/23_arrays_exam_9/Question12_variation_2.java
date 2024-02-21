public class Question10 
{
  
    static int value_1 = 3;
    static int value_2 = 20;
    
    public int method1(int i, int j)
    {
         i = (this.value_1);
         j = value_2;
         int multiplication = (i * j);

         return multiplication;
    }
    public static void main(String[]args)
    { 
        Question10 values = new Question10();

       

        System.out.println("result = " + values.method1(value_1,value_2));

    }
}
