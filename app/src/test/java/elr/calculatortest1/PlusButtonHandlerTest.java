package elr.calculatortest1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Emmet on 08/11/2016.
 */
public class PlusButtonHandlerTest {

    @Test
    public void handleInput() throws Exception {
        CalculatorState calculatorState = new DefaultCalculatorState();
        UserInputProvider input = new DummyUserInputProvider();

        PlusButtonHandler handler = new PlusButtonHandler(calculatorState, input);
        handler.handleInput();
        handler.handleInput();
        assertEquals("2+2 should equal 4", Double.valueOf(4.0), Double.valueOf(calculatorState.getCurrentValue()));
    }

}

class DummyUserInputProvider implements UserInputProvider{

    @Override
    public double getUserInput() {
        return 2.0;
    }
}