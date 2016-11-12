package elr.calculatortest1;

import org.junit.Test;

import elr.calculatortest1.calculator.DefaultCalculatorState;
import elr.calculatortest1.operator.PlusOperator;

import static org.junit.Assert.*;

public class DefaultCalculatorStateTest {

    @Test
    public void twoPlusTwo() throws Exception{
        DefaultCalculatorState calculator = new DefaultCalculatorState();
        calculator.updateState(2.0, PlusOperator.INSTANCE);
        calculator.updateState(2.0);
        assertEquals("2+2 should equal 4", Double.valueOf(4.0), Double.valueOf(calculator.getCurrentValue()));
    }

    @Test
    public void twoPlusTwoSetTwo() throws Exception{
        DefaultCalculatorState calculator = new DefaultCalculatorState();
        calculator.updateState(2.0, PlusOperator.INSTANCE);
        calculator.updateState(2.0);
        calculator.updateState(2.0);
        assertEquals("should equal 2", Double.valueOf(2.0), Double.valueOf(calculator.getCurrentValue()));
    }

    @Test
    public void twoPlusSetTwoPlusTwo() throws Exception{
        DefaultCalculatorState calculator = new DefaultCalculatorState();
        calculator.updateState(2.0, PlusOperator.INSTANCE);
        calculator.updateState(2.0);
        calculator.updateState(2.0, PlusOperator.INSTANCE);
        assertEquals("should equal 2", Double.valueOf(2.0), Double.valueOf(calculator.getCurrentValue()));
    }

    @Test
    public void twoPlusSetTwoSetTwoSetTwo() throws Exception{
        DefaultCalculatorState calculator = new DefaultCalculatorState();
        calculator.updateState(2.0, PlusOperator.INSTANCE);
        calculator.updateState(2.0);
        calculator.updateState(2.0);
        calculator.updateState(2.0);
        assertEquals("should equal 2", Double.valueOf(2.0), Double.valueOf(calculator.getCurrentValue()));
    }

}