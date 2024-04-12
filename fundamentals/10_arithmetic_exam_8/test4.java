public class test4
{
    public static void main(String[]args)
    {

    //Breakdown to show the sequence of the code
        double e = 10.5;
        double f;
        double g = 2;
        int h = 0;
        e++;
        e = ++e;

        f = 12.5/g;
        System.out.println("f at breakdown " +f);

        f = f*4;
        System.out.println("f at breakdown " +f);

        f = f%2;
        System.out.println("f at breakdown " +f);

        f = e + f;
        System.out.println("f at breakdown " +f);

        double i =  e * g;
        System.out.println("i at breakdown " +i);
        i =  f/h;
        System.out.println("i at breakdown " +i);
        f = f % i;
        System.out.println("f at breakdown " +f);





    //Original code 

        double a =10.5;
        double b;
        double c =2 ;
        int d = 0;
        ++a;
        a = ++a;

        b = a + --a/c--*4%2;
        b %=a*c/d;
        System.out.println(b);
    }
}