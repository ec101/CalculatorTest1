package elr.calculatortest1.calculator;

import elr.calculatortest1.operator.BinaryOperator;

/**
 * Created by Emmet on 05/11/2016.
 */

public interface CalculatorState {

    void updateState(double value);

    void updateState(double value, BinaryOperator nextOperation);

    double getCurrentValue();
}
