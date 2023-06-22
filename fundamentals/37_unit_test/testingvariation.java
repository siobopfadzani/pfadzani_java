import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Divider{
    public double divideByZero(double a){ 
        return a/0;
    }

    public double divideByNegative(double a,double b){ 
        return a/(-1*b);
    }

    public double divideByPositive(double a,double b){ 
        return a/b;
    }
    @Test
    public void testDivideByZero(){
       Divider divider = new Divider();
       double a = 10.0;
       Assertion.assertThrows(ArithmeticExceptions.class,()->{
       divider.divideByZero(a);}, "don't do that") ;
    }
    
    
    
    
    
    
    
    
    
    public static void main(String[]args){
    
        DividerTest dividerTest = new DividerTest();
        dividerTest.testDivideByZero();
        dividerTest.testDivideByNegative();
        dividerTest.testDivideByPositive();
    
    }
    
}

