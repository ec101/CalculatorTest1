package elr.calculatortest1.io;

/**
 * Created by Emmet on 27/11/2016.
 */
public class NineInputHandlerImpl extends NumberInputHandler {
    public NineInputHandlerImpl(UserInput userInput) {
        super(userInput);
    }

    @Override
    protected int getInputValue() {
        return 9;
    }
}