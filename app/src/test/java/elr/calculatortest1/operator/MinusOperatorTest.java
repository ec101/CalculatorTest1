package elr.calculatortest1.operator;

import org.junit.Test;

import elr.calculatortest1.operator.MinusOperator;

import static org.junit.Assert.*;

public class MinusOperatorTest {

    @Test
    public void testThreeMinusTwo() throws Exception {
        MinusOperator minusOperator = MinusOperator.INSTANCE;
        Double result = minusOperator.calculate(3.0, 2.0);
        assertTrue("Minus NOT working correctly!", result==1.0);
    }

    @Test
    public void testThreeMinusZeroCase() throws Exception {
        MinusOperator minusOperator = MinusOperator.INSTANCE;
        Double result = minusOperator.calculate(3.0, 0.0);
        assertTrue("Minus NOT working correctly!", result==3.0);
    }

    @Test
    public void testZeroMinusZeroCase() throws Exception {
        MinusOperator minusOperator = MinusOperator.INSTANCE;
        Double result = minusOperator.calculate(0.0, 0.0);
        assertTrue("Minus NOT working correctly!", result==0.0);
    }

    @Test
    public void testTenMinusOneCase() throws Exception {
        MinusOperator minusOperator = MinusOperator.INSTANCE;
        Double result = minusOperator.calculate(10.0, 1.0);
        assertTrue("Minus NOT working correctly!", result==9);
    }

    @Test
    public void testZeroMinusOneCase() throws Exception {
        MinusOperator minusOperator = MinusOperator.INSTANCE;
        Double result = minusOperator.calculate(0.0, 1.0);
        assertTrue("Minus NOT working correctly!", result==-1.0);
    }

    @Test
    public void testZeroMinusNegativeOneCase() throws Exception {
        MinusOperator minusOperator = MinusOperator.INSTANCE;
        Double result = minusOperator.calculate(0.0, -1.0);
        assertTrue("Minus NOT working correctly!", result==1);
    }
}
