import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DividerTest {

    @Test
    public void testDivideByZero() {
        Divider divider = new Divider();
        double result = divider.divideByZero(20);
        assertEquals("Don't do that", Double.toString(result));
    }

    @Test
    public void testDivideByNegative() {
        Divider divider = new Divider();
        double result = divider.divideByNegative(20, 2);
        assertEquals("Don't do that", Double.toString(result));
    }

    @Test
    public void testDivideByPositive() {
        Divider divider = new Divider();
        double result = divider.divideByPositive(20, 2);
        assertEquals("Don't do that", Double.toString(result));
    }
}



