public class Question10_variation_3 
{
    int value_1 = 10;
    public int method1(int i, int j)
    {
         i = (this.value_1);
         int multiplication = (i * j);

         return multiplication;
    }
    public static void main(String[]args)
    { 
        Question10_variation_3 values = new Question10_variation_3();
        System.out.println("result = " + values.method1(10,2));

    }
}
