public class Question10_variation_3 
{
    int value_1 = 10;
    int value_2 = 20;
    static int value_3 = 10;
    public int calc(int a,int b)
    {
        this.value_1 = a;
        this.value_2 = b;
        return value_1 + value_2 + value_3;
    }
    public static void main(String[]args)
    { 
        Question10_variation_3 valueread = new Question10_variation_3();
        System.out.println(valueread.calc(100,20));
    }
}
