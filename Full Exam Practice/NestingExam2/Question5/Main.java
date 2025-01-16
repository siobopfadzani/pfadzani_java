interface Caluculable
{
    double calculate(double a , double b);

    default double perfomoperation(double a, double b, Operation op)
    {
        return op.execute(a,b);
    }
    default double sqrt(double a)
    {
        return Math.sqrt(a);
    }
}
 interface Operation {

    double execute (double a, double b);
}
public class Main
{
    public static void main(String[] args) {
     Caluculable customCaluculable = new Caluculable() {
        public double sqrt(double a){
            System.out.println("custom sqrt implementation");
            return Math.sqrt(a);
        }
        public double calculate(double a, double b)
        {
            return(a*b);
        }
     };
    }
}