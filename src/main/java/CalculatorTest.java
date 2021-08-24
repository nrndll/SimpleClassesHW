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
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void canSubtract(){
        assertEquals(0, calculator.subtract(2, 2));
    }

    @Test
    public void canMultiply(){
        assertEquals(16, calculator.multiply(4, 4));
    }

    @Test
    public void canDivide(){
        assertEquals(7.8, calculator.divide(39, 5), 0.01);
    }
}

