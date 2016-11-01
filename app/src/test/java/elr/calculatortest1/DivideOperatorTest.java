package elr.calculatortest1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by roryo on 27/10/2016.
 */
public class DivideOperatorTest {
    @Test
    public void infiniteTest() throws Exception {
        DivideOperator div = new DivideOperator();
        Double result = div.calculate(1.0,0.0);
        assertTrue("Division by zero is NOT working :'(", result.isNaN());
    }
    @Test
    public void divisionAcceptanceTest() throws Exception {
        DivideOperator div = new DivideOperator();
        Double result = div.calculate(1.0,1.0);
        assertTrue("Simmple division is NOT working :(", result==1.0);
    }
    @Test
    public void divisionDecimalTest() throws Exception {
        DivideOperator div = new DivideOperator();
        Double result = div.calculate(3.0,1.5);
        assertTrue("Division with decimals is NOT working >:( ", result==2.0);
    }
    @Test
    public void doubleNegativeDivisionTest() throws Exception {
        DivideOperator div = new DivideOperator();
        Double result = div.calculate(-1.0,-1.0);
        assertTrue("Division by a negative number is not working >:| ", result==1.0);
    }
    @Test
    public void negativeDivisionTest() throws Exception {
        DivideOperator div = new DivideOperator();
        Double result = div.calculate(1.0,-1.0);
        assertTrue("Division by a negative number is not working >:| ", result==-1.0);
    }
}