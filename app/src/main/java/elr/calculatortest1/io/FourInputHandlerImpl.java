package elr.calculatortest1.io;

/**
 * Created by Emmet on 27/11/2016.
 */
public class FourInputHandlerImpl extends NumberInputHandler {
    public FourInputHandlerImpl(UserInput userInput) {
        super(userInput);
    }

    @Override
    protected double getInputValue() {
        return 4.0;
    }
}
