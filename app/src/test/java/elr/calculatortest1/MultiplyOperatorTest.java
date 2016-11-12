package elr.calculatortest1;

import org.junit.Test;

import elr.calculatortest1.operator.MultiplyOperator;

import static org.junit.Assert.*;

/**
 * Created by lquinn on 25/10/2016.
 * Adding the Multiply unit tests
 */
public class MultiplyOperatorTest {
    @Test
    public void simpleTest() throws Exception {

        MultiplyOperator multiplyTest = MultiplyOperator.INSTANCE;
        Double result = multiplyTest.calculate(2.0,3.0);
        assertTrue("The simple multiply test is not working", result==6.0);
     }

    @Test
    public void testUnitaryNegative() throws Exception {
        MultiplyOperator multiplyTest = MultiplyOperator.INSTANCE;
        Double result = multiplyTest.calculate(-2.0,3.0);
        assertTrue("The unitary negative multiply test is not working", result==-6.0);

    }
    @Test
    public void testDoubleNegative() throws Exception {
        MultiplyOperator multiplyTest = MultiplyOperator.INSTANCE;
        Double result = multiplyTest.calculate(-2.0,-3.0);
        assertTrue("The double negative multiply test is not working", result==6.0);
    }
    @Test
    public void testNegativeWithZero() throws Exception {
        MultiplyOperator multiplyTest = MultiplyOperator.INSTANCE;
        Double result = multiplyTest.calculate(2.0,0.0);
        assertTrue("The multiply by zero test is not working", result==0.0);
    }
    @Test
    public void testZeroMultiplyZero() throws Exception {
        MultiplyOperator multiplyTest = MultiplyOperator.INSTANCE;
        Double result = multiplyTest.calculate(0.0,0.0);
        assertTrue("The zero multiply by zero test is not working", result==0.0);
    }
}