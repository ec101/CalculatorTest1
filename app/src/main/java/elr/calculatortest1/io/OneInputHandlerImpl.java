package elr.calculatortest1.io;

/**
 * Created by Emmet on 27/11/2016.
 */
public class OneInputHandlerImpl extends NumberInputHandler {

    public OneInputHandlerImpl(UserInput userInput) {
        super(userInput);
    }

    @Override
    protected double getInputValue() {
        return 1.0;
    }
}
