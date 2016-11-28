package elr.calculatortest1.io;

import org.junit.Test;

import java.util.ArrayList;

import elr.calculatortest1.calculator.CalculatorState;
import elr.calculatortest1.calculator.DefaultCalculatorState;

import static org.junit.Assert.*;

/**
 * Created by Emmet on 13/11/2016.
 */
public class MultiplyButtonHandlerTest {

    @Test
    public void handleDUmmyInput() throws Exception {
        CalculatorState calculatorState = new DefaultCalculatorState();
        UserInput input = new DummyUserInputProvider();
        MultiplyButtonHandler handler = new MultiplyButtonHandler(calculatorState, input);
        handler.handleInput();
        handler.handleInput();
        assertEquals("2*2 should equal 4", Double.valueOf(4.0), Double.valueOf(calculatorState.getCurrentValue()));
    }

    @Test
    public void handleDefinedInput() throws Exception {
        CalculatorState calculatorState = new DefaultCalculatorState();
        ArrayList<Double> values = new ArrayList<Double>();
        values.add(6.0);
        values.add(2.0);
        values.add(5.0);
        UserInput input = new DefinedUserInputProvider(values);
        MultiplyButtonHandler handler = new MultiplyButtonHandler(calculatorState, input);
        handler.handleInput();
        handler.handleInput();
        handler.handleInput();
        assertEquals("6*2*5 should equal 60", Double.valueOf(60.0), Double.valueOf(calculatorState.getCurrentValue()));
    }
}