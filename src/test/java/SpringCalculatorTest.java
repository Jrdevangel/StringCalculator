import org.junit.Test;
import string.calculator.StringCalculator;

import static org.junit.Assert.assertEquals;

public class SpringCalculatorTest {
    @Test
    public void testAdd() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1,2,3"));
        assertEquals(6, calculator.add("1\n2,3"));
        assertEquals(3, calculator.add("//;\n1;2"));
    }

    @Test
    public void testSubtract() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(5, calculator.subtract("10,2,3"));
    }

    @Test
    public void testMultiply() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(24, calculator.multiply("2,3,4"));
    }

    @Test
    public void testDivide() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(5.0, calculator.divide("10,2"), 0.01);
    }

    @Test(expected = RuntimeException.class)
    public void testAddWithNegatives() {
        StringCalculator calculator = new StringCalculator();
        calculator.add("1,-2,-3");
    }
}
