package elr.calculatortest1.io;

/**
 * Created by Emmet on 27/11/2016.
 */
public class ThreeInputHandlerImpl extends NumberInputHandler {
    public ThreeInputHandlerImpl(UserInput userInput) {
        super(userInput);
    }

    @Override
    protected double getInputValue() {
        return 3.0;
    }
}
