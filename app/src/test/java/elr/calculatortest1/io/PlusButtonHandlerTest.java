package elr.calculatortest1.io;

import org.junit.Test;

import java.util.ArrayList;

import elr.calculatortest1.calculator.CalculatorState;
import elr.calculatortest1.calculator.DefaultCalculatorState;

import static org.junit.Assert.*;

/**
 * Created by Emmet on 08/11/2016.
 */
public class PlusButtonHandlerTest {

    @Test
    public void handleBasicInput() throws Exception {
        CalculatorState calculatorState = new DefaultCalculatorState();
        UserInput input = new DummyUserInput();
        PlusButtonHandler handler = new PlusButtonHandler(calculatorState, input);
        handler.handleInput();
        handler.handleInput();
        assertEquals("2+2 should equal 4", Double.valueOf(4.0), Double.valueOf(calculatorState.getCurrentValue()));
    }

    @Test
    public void handleDefinedInput() throws Exception {
        CalculatorState calculatorState = new DefaultCalculatorState();
        ArrayList<Double> values = new ArrayList<Double>();
        values.add(3.0);
        values.add(4.0);
        values.add(5.0);
        UserInput input = new DefinedUserInput(values);
        PlusButtonHandler handler = new PlusButtonHandler(calculatorState, input);
        handler.handleInput();
        handler.handleInput();
        handler.handleInput();
        assertEquals("3+4+5 should equal 12", Double.valueOf(12.0), Double.valueOf(calculatorState.getCurrentValue()));
    }
}