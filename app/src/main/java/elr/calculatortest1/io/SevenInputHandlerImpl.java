package elr.calculatortest1.io;

/**
 * Created by Emmet on 27/11/2016.
 */
public class SevenInputHandlerImpl extends NumberInputHandler {
    public SevenInputHandlerImpl(UserInput userInput) {
        super(userInput);
    }

    @Override
    protected double getInputValue() {
        return 7.0;
    }
}
