import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorLogicTest {

    CalculatorLogic logic = new CalculatorLogic();

    @Test
    public void testAddition() {
        assertEquals(5.0, logic.add(2, 3), 0.001);
    }

    @Test
    public void testSubtraction() {
        assertEquals(1.0, logic.subtract(5, 4), 0.001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, logic.multiply(2, 3), 0.001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, logic.divide(10, 5), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        logic.divide(5, 0);
    }
}
