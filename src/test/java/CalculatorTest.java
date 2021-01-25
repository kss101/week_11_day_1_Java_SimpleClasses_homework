import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(12, calculator.add(8,4));
    }

    @Test
    public void canSubtract(){
      assertEquals(4, calculator.subtract(8,4));
    }

    @Test
    public void canMultiply(){
        assertEquals(32, calculator.multiply(8,4));
    }

    @Test
    public void canDivide(){
        //assertEquals(2,calculator.divide(8,4), 0.0);
    }

}
