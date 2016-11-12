package elr.calculatortest1;

import org.junit.Test;

import elr.calculatortest1.operator.PlusOperator;

import static org.junit.Assert.*;

/**
 * Created by lquinn on 24/10/2016.
 */
public class PlusOperatorTest {
    @Test
    public void calculate() throws Exception {
        Double result = PlusOperator.INSTANCE.calculate(1.0, 2.0);
        assertTrue("Plus NOT working correctly!", result == 3.0);
    }

}