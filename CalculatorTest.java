import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAddition() {
        assertEquals(4, Calculator.add(2, 2));
    }
}
