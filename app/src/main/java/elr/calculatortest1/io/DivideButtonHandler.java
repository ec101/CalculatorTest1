package elr.calculatortest1.io;

import elr.calculatortest1.calculator.CalculatorState;
import elr.calculatortest1.operator.BinaryOperator;
import elr.calculatortest1.operator.DivideOperator;

/**
 * Created by Emmet on 12/11/2016.
 */

public class DivideButtonHandler extends AbstractOperatorInputHandler {

    public DivideButtonHandler(CalculatorState calculatorState, UserInputProvider input) {
        super(calculatorState, input);
    }

    @Override
    protected BinaryOperator getBinaryOperator() {
        return DivideOperator.INSTANCE;
    }
}
