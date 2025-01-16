package LamdaExam.Question4;

public class Main
{
    public static void main(String[]args)
    {
        calculable calculable = (a,b) -> a * b;
        operation res = (a,b)-> a + b;
        System.out.println("Result " + calculable.performOperation(5, 3, res));
    }
}

interface  calculable 
{
    double caluculate(double a, double b);
    default double performOperation(double a, double b, operation op)
    {
        return op.execute(a, b);
    }
    
}

interface operation
{
    double execute(double a, double b);
}