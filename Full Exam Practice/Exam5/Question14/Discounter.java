package Exam5.Question14;

public class Discounter {
    static double percent;
    int offset = 10, base = 50;
    public static  double calc(double value)
        {
            int coupon,offset,base;
        //     if(percent < 10)
        //     {
        //         coupon =15;
        //         offset = 20;
        //         base = 10;
        //     }
        //     return  coupon*offset*base*value/100;
        // }
        public static void main(String[]args)
        {
            System.out.println(calc(10));
    }
    
}
