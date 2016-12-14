package elr.calculatortest1.io;

import elr.calculatortest1.calculator.CalculatorState;

/**
 * Created by Emmet on 06/11/2016.
 */

public class EqualsButtonHandler implements OperatorInputHandler {

    private final CalculatorState calculatorState;
    private final UserInput input;

    public EqualsButtonHandler(final CalculatorState calculatorState, final UserInput input){
        super();
        this.calculatorState = calculatorState;
        this.input = input;
    }

    @Override
    public void handleInput() {
        double value = this.input.getCurrentInput();
        this.calculatorState.updateState(value);
        this.input.setCurrentInput(this.calculatorState.getCurrentValue());
    }
}
