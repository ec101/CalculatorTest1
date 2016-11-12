package elr.calculatortest1.io;

import elr.calculatortest1.calculator.CalculatorState;
import elr.calculatortest1.operator.BinaryOperator;

/**
 * Created by Emmet on 12/11/2016.
 */

abstract class AbstractOperatorInputHandler implements OperatorInputHandler {

    private final CalculatorState calculatorState;
    private final UserInputProvider input;

    AbstractOperatorInputHandler(final CalculatorState calculatorState, final UserInputProvider input){
        super();
        this.calculatorState = calculatorState;
        this.input = input;
    }

    @Override
    public void handleInput() {
        double value = this.input.getUserInput();
        this.calculatorState.updateState(value, getBinaryOperator());
    }

    protected abstract BinaryOperator getBinaryOperator();
}
