import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {calculator = new Calculator();}

    @Test
    public void can_add(){
        assertEquals(12, calculator.add(7, 5));
    }

    @Test
    public void can_subtract(){
        assertEquals(0, calculator.subtract(5, 5));
    }

    @Test
    public void can_multiply(){
        assertEquals(36, calculator.multiply(6, 6));
    }

    @Test
    public void can_divide(){
        assertEquals(5.35, calculator.divide(123, 23), 0.01);
    }

}

//- Create a Calculator class.
// This should have functions for Add, Subtract, Multiply and Divide.
// Your methods should take in two ints to perform the calculations on
// (except the Divide method. This should take two doubles as arguments).
