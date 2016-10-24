package elr.calculatortest1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Emmet on 24/10/2016.
 */
public class CalculatorTest {

    @Test
    public void calculate() throws Exception {
        Calculator calculator = new Calculator();
        Integer result = calculator.calculate(Integer.valueOf(2), Operator.PLUS, Integer.valueOf(3));
        assertTrue("We can't add", result == 5);
    }

}