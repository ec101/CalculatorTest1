package elr.calculatortest1.io;

import elr.calculatortest1.calculator.CalculatorState;

/**
 * Created by Emmet on 06/11/2016.
 */

public class EqualsButtonHandler implements OperatorInputHandler {

    private final CalculatorState calculatorState;
    private final UserInputProvider input;

    public EqualsButtonHandler(final CalculatorState calculatorState, final UserInputProvider input){
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
