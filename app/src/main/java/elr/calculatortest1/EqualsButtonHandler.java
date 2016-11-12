package elr.calculatortest1;

/**
 * Created by Emmet on 06/11/2016.
 */

public class EqualsButtonHandler implements OperatorInputHandler {

    private final CalculatorState calculatorState;
    private final DefaultUserInputProvider input;

    public EqualsButtonHandler(final CalculatorState calculatorState, final DefaultUserInputProvider input){
        super();
        this.calculatorState = calculatorState;
        this.input = input;
    }

    @Override
    public void handleInput() {
        double value = this.input.getUserInput();
        this.calculatorState.updateState(value);
    }
}
