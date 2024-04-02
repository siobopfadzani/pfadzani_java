package Divider;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class DividerTest 
{
    Divider divider = new Divider();

    @Test
    String testDivideByZero() 
    {
    	assertEquals(Double.POSITIVE_INFINITY,divider.divideByZero(10)+" ");
    	return "don't do that";
   	}

    @Test
    String testDivideByNegative() 
    {
   
        assertEquals(0,  divider.divideByNegative(10, 10));
        return "don't do that";
    }

    @Test
    String testDivideByPositive() 
    {
        assertEquals(1, divider.divideByPositive(10, 10));
        return "don't do that";
    }


}
