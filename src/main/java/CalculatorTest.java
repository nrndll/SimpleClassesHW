import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(4, 4, 32.4, 16.5);
    }

    @Test
    public void canAdd(){
        assertEquals(8, calculator.add());
    }

    @Test
    public void canSubtract(){
        assertEquals(0, calculator.subtract());
    }

    @Test
    public void canMultiply(){
        assertEquals(16, calculator.multiply());
    }

    @Test
    public void canDivide(){
        calculator = new Calculator(1, 1, 32.4, 16.5);
        assertEquals(1.96, calculator.divide(), 0.1);
    }

}
