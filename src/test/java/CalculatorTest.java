import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp()  {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(15, calculator.add(9, 6));
    }

    @Test
    public void canSubtract(){
        assertEquals(13, calculator.subtract(30, 17));
    }

    @Test
    public void canMultiply(){
        assertEquals(50, calculator.multiply(5, 10));
    }

    @Test
    public void canDivide(){
        assertEquals(5.0, calculator.divide(300, 60), 0.01);
    }
}
