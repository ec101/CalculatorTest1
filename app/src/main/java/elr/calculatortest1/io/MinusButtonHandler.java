package elr.calculatortest1.io;

import elr.calculatortest1.calculator.CalculatorState;
import elr.calculatortest1.operator.BinaryOperator;
import elr.calculatortest1.operator.MinusOperator;

/**
 * Created by Emmet on 12/11/2016.
 */

public class MinusButtonHandler extends AbstractOperatorInputHandler {

    public MinusButtonHandler(CalculatorState calculatorState, UserInputProvider input) {
        super(calculatorState, input);
    }

    @Override
    protected BinaryOperator getBinaryOperator() {
        return MinusOperator.INSTANCE;
    }
}
