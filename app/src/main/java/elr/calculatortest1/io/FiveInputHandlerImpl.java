package elr.calculatortest1.io;

/**
 * Created by Emmet on 27/11/2016.
 */
public class FiveInputHandlerImpl extends NumberInputHandler {
    public FiveInputHandlerImpl(UserInput userInput) {
        super(userInput);
    }

    @Override
    protected int getInputValue() {
        return 5;
    }
}
