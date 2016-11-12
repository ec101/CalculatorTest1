package elr.calculatortest1;

/**
 * Created by Emmet on 05/11/2016.
 */

public class PlusButtonHandler implements OperatorInputHandler {

    private final CalculatorState calculatorState;
    private final UserInputProvider input;

    public PlusButtonHandler(final CalculatorState calculatorState, final UserInputProvider input){
        super();
        this.calculatorState = calculatorState;
        this.input = input;
    }

    public void handleInput(){
        double value = this.input.getUserInput();
        this.calculatorState.updateState(value, PlusOperator.PLUS_OPERATOR);
    }
}
