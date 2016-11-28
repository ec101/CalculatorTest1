package elr.calculatortest1.io;

import elr.calculatortest1.calculator.CalculatorState;
import elr.calculatortest1.operator.BinaryOperator;
import elr.calculatortest1.operator.PlusOperator;

/**
 * Created by Emmet on 05/11/2016.
 */

public class PlusButtonHandler extends AbstractOperatorInputHandler {

    public PlusButtonHandler(final CalculatorState calculatorState, final UserInput input){
        super(calculatorState, input);
    }

    @Override
    protected BinaryOperator getBinaryOperator() {
        return PlusOperator.INSTANCE;
    }
}
