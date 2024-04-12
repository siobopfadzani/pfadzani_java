public class Question10 
{
    double i1 = 0.9;
    static int i2 = 10;

    public void method1() {
        
        int i;
        i = (int)(this.i1);
        i = this.i2;
        this.i1 = i2;

    }

    public static void main(String[] args) 
    {
        // Create an instance of Question10

        Question10 instance = new Question10();

        // Access and print the value of i1 from the instance
        
        System.out.println(instance.i1);
        System.out.println(instance.i2);
    }
}
