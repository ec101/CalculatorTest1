package elr.calculatortest1.io;

/**
 * Created by Emmet on 27/11/2016.
 */
public class EightInputHandlerImpl extends NumberInputHandler {
    public EightInputHandlerImpl(UserInput userInput) {
        super(userInput);
    }

    @Override
    protected double getInputValue() {
        return 8.0;
    }
}
