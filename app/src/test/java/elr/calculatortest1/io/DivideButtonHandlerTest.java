package elr.calculatortest1.io;

import org.junit.Test;

import java.util.ArrayList;

import elr.calculatortest1.calculator.CalculatorState;
import elr.calculatortest1.calculator.DefaultCalculatorState;

import static org.junit.Assert.*;

/**
 * Created by Emmet on 13/11/2016.
 */
public class DivideButtonHandlerTest {

    @Test
    public void handleInput() throws Exception {
        CalculatorState calculatorState = new DefaultCalculatorState();
        UserInputProvider input = new DummyUserInputProvider();
        DivideButtonHandler handler = new DivideButtonHandler(calculatorState, input);
        handler.handleInput();
        handler.handleInput();
        assertEquals("2/2 should equal 1", Double.valueOf(1.0), Double.valueOf(calculatorState.getCurrentValue()));
    }

    @Test
    public void handleDefinedInput() throws Exception {
        CalculatorState calculatorState = new DefaultCalculatorState();
        ArrayList<Double> values = new ArrayList<Double>();
        values.add(24.0);
        values.add(2.0);
        values.add(3.0);
        UserInputProvider input = new DefinedUserInputProvider(values);
        DivideButtonHandler handler = new DivideButtonHandler(calculatorState, input);
        handler.handleInput();
        handler.handleInput();
        handler.handleInput();
        assertEquals("24/2/3 should equal 4", Double.valueOf(4.0), Double.valueOf(calculatorState.getCurrentValue()));
    }

}