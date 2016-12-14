package elr.calculatortest1.io;

import elr.calculatortest1.calculator.CalculatorState;
import elr.calculatortest1.operator.BinaryOperator;
import elr.calculatortest1.operator.MinusOperator;

/**
 * Created by Emmet on 12/11/2016.
 */

public class MinusButtonHandler extends AbstractOperatorInputHandler {

    public MinusButtonHandler(CalculatorState calculatorState, UserInput input) {
        super(calculatorState, input);
    }

    @Override
    public void handleInput() {
        if(this.input.isEmpty()){
            this.input.setNegativeNumber();
        }else {
            double value = this.input.getCurrentInput();
            this.calculatorState.updateState(value, getBinaryOperator());
            input.clearCurrentInput();
        }
    }

    @Override
    protected BinaryOperator getBinaryOperator() {
        return MinusOperator.INSTANCE;
    }
}
