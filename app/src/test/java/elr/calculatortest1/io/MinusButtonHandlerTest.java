package elr.calculatortest1.io;

import org.junit.Test;

import java.util.ArrayList;

import elr.calculatortest1.calculator.CalculatorState;
import elr.calculatortest1.calculator.DefaultCalculatorState;

import static org.junit.Assert.*;

/**
 * Created by Emmet on 13/11/2016.
 */
public class MinusButtonHandlerTest {

    @Test
    public void handleDummyInput() throws Exception {
        CalculatorState calculatorState = new DefaultCalculatorState();
        UserInput input = new DummyUserInputProvider();
        MinusButtonHandler handler = new MinusButtonHandler(calculatorState, input);
        handler.handleInput();
        handler.handleInput();
        assertEquals("2-2 should equal 0", Double.valueOf(0.0), Double.valueOf(calculatorState.getCurrentValue()));
    }

    @Test
    public void handleDefinedInput() throws Exception {
        CalculatorState calculatorState = new DefaultCalculatorState();
        ArrayList<Double> values = new ArrayList<Double>();
        values.add(12.0);
        values.add(1.0);
        values.add(6.0);
        UserInput input = new DefinedUserInputProvider(values);
        MinusButtonHandler handler = new MinusButtonHandler(calculatorState, input);
        handler.handleInput();
        handler.handleInput();
        handler.handleInput();
        assertEquals("12-1-6 should equal 5", Double.valueOf(5.0), Double.valueOf(calculatorState.getCurrentValue()));
    }
}