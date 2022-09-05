import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    //    Test to add
    @Test
    public void canAdd() { assertEquals(10, calculator.add(3, 7)); }

    //    Test to subtract
    @Test
    public void canSubtract() { assertEquals(5, calculator.subtract(10, 5)); }

    //    Test to multiply
    @Test
    public void canMultiply() { assertEquals(25, calculator.multiply(5,5)); }

    //    Test to divide
    @Test
    public void canDivide() { assertEquals(4.0, calculator.divide(8.8, 2.2), 0.001); }
}







