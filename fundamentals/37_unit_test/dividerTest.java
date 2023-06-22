import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DividerTest {
    private Divider divider = new Divider();

    @Test
    public void testDivideByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            divider.divideByZero(5.0);
        }, "Don't do that");
    }

    @Test
    public void testDivideByNegative() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            divider.divideByNegative(10.0, -2.0);
        }, "Don't do that");
    }

    @Test
    public void testDivideByPositive() {
        double result = divider.divideByPositive(10.0, 2.0);
        Assertions.assertEquals(5.0, result, 0.0001);
    }
}

public class DriverTest1{
	private Driver1 driver = new Driver1();
	
	 @Test
         public void testDivideByZero() {
          Assertions.assertThrows(ArithmeticException.class, () -> {
            divider.divideByZero(2.0);
        }, "Don't do that");
        
    }

}
public class Divider {

    public double divideByZero(double a) {
        return a / 0;
    }

    public double divideByNegative(double a, double b) {
        return a / (-1 * b);
    }

    public double divideByPositive(double a, double b) {
        return a / b;
    }
}




