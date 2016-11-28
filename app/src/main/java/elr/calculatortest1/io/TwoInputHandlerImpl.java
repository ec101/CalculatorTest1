package elr.calculatortest1.io;

/**
 * Created by Emmet on 27/11/2016.
 */
public class TwoInputHandlerImpl extends NumberInputHandler {
    public TwoInputHandlerImpl(UserInput userInput) {
        super(userInput);
    }

    @Override
    protected double getInputValue() {
        return 2.0;
    }
}
