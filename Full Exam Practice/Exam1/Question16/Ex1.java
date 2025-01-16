package Exam1.Question16;

public class Ex1 {
    // int a = 10;
    // public static void main(String[] args) {
    //     new Ex1().print();
    // }
    // public void print()
    // {
    //     int a = 8;
    //     System.out.println(a );
    // }
    private int j;
    void show()
    {
        label1: while(j <=5)
        {
           System.out.println("hi");
            for(int j = 1;j <= 5;)
            {
                
                System.out.println(j + " ");
                j++;
            }
            j++;
        }
        
    }
    public static void main(String[] args) {
        new Ex1().show();
    }
}
