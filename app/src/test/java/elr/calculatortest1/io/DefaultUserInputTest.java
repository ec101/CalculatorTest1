package elr.calculatortest1.io;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Emmet on 28/11/2016.
 */
public class DefaultUserInputTest {

    @Test
    public void basicTest(){
        DefaultUserInput userInput = new DefaultUserInput();
        userInput.updateCurrentInput(1);
        userInput.updateCurrentInput(2);
        userInput.updateCurrentInput(3);
        assertEquals("User should be 123.0", Double.valueOf(123.0), Double.valueOf(userInput.getCurrentInput()));
    }

    @Test
    public void decimalTest(){
        DefaultUserInput userInput = new DefaultUserInput();
        userInput.updateCurrentInput(1);
        userInput.updateCurrentInput(2);
        userInput.updateCurrentInput(3);
        userInput.decimalPoint();
        userInput.updateCurrentInput(1);
        userInput.updateCurrentInput(2);
        userInput.updateCurrentInput(3);
        assertEquals("User should be 123.123", Double.valueOf(123.123), Double.valueOf(userInput.getCurrentInput()));
    }

    @Test
    public void decimalTest2(){
        DefaultUserInput userInput = new DefaultUserInput();
        userInput.updateCurrentInput(0);
        userInput.decimalPoint();
        userInput.updateCurrentInput(0);
        userInput.updateCurrentInput(0);
        userInput.updateCurrentInput(0);
        userInput.updateCurrentInput(0);
        userInput.updateCurrentInput(0);
        userInput.updateCurrentInput(0);
        userInput.updateCurrentInput(0);
        userInput.updateCurrentInput(0);
        userInput.updateCurrentInput(0);
        userInput.updateCurrentInput(0);
        userInput.updateCurrentInput(1);
        assertEquals("User should be 0.00000000001", Double.valueOf(0.00000000001), Double.valueOf(userInput.getCurrentInput()));
    }
}