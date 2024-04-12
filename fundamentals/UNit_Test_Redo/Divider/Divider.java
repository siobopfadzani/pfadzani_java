package Divider;

public class Divider
{
    public void main(String[] args) 
    {
        Divider divider = new Divider();
        System.out.println(divider.divideByZero(10));
        System.out.println(divider.divideByNegative(10,10));
        System.out.println(divider.divideByPositive(10,10));
    }
    public  double divideByZero(double a){ 
        return a/0;
    }

    public  double divideByNegative(double a,double b){ 
        return a/(-1*b);
    }

    public  double divideByPositive(double a,double b){ 
        return a/b;
    }
}
