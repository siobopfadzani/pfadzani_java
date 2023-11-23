public class test6
{
    public static void main(String[]args)
    {

    //Breakdown to show the sequence of the code
        double e = 10.5;
        double f = 2;
        double g ;
        ++e;
        e = e * e++;
        System.out.println("e "+e);

        g = ++e * f++;
        System.out.println("g "+g);

    //Original code 

        double a =10.5;
        double b=2;
        double c;
        ++a;
        a *= a++;
        c = ++a * b++;
        System.out.println(c);
    }
}