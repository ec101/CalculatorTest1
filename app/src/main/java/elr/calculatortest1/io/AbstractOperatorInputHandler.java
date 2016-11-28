package elr.calculatortest1.io;

import elr.calculatortest1.calculator.CalculatorState;
import elr.calculatortest1.operator.BinaryOperator;

/**
 * Created by Emmet on 12/11/2016.
 */

abstract class AbstractOperatorInputHandler implements OperatorInputHandler {

    private final CalculatorState calculatorState;
    private final UserInput input;

    AbstractOperatorInputHandler(final CalculatorState calculatorState, final UserInput input){
        super();
        this.calculatorState = calculatorState;
        this.input = input;
    }

    @Override
    public void handleInput() {
        double value = this.input.getCurrentInput();
        this.calculatorState.updateState(value, getBinaryOperator());
        input.clearCurrentInput();
    }

    protected abstract BinaryOperator getBinaryOperator();
}
