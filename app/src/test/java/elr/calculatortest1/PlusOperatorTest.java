package elr.calculatortest1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lquinn on 24/10/2016.
 */
public class PlusOperatorTest {
    @Test
    public void calculate() throws Exception {

        PlusOperator rorysPlusOperator = new PlusOperator();
        Double result = rorysPlusOperator.calculate(Double.valueOf(1),Double.valueOf(2));
        assertTrue("Plus NOT working correctly!", result.doubleValue()==3.0);
    }

}