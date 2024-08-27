import org.junit.Test;
import string.calculator.StringCalculator;

import static org.junit.Assert.assertEquals;

public class SpringCalculatorTest {

    @Test
    public void testMultiply() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(286580, calculator.multiply("230,89,14"));
    }

    @Test
    public void testDivide() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(5.0, calculator.divide("10,2"), 0.01);
    }
}
