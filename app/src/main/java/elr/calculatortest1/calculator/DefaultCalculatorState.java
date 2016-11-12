package elr.calculatortest1.calculator;

import elr.calculatortest1.operator.BinaryOperator;

/**
 * Created by Emmet on 05/11/2016.
 */

public class DefaultCalculatorState implements CalculatorState {

    private double total;
    private BinaryOperator currentOperator;

    public DefaultCalculatorState(){
        this.total = 0.0;
        this.currentOperator = null;
    }

    @Override
    public void updateState(double value) {
        if(this.currentOperator == null){
            this.total = value;
        }else {
            this.total = this.currentOperator.calculate(total, value);
            this.currentOperator = null;
        }
    }

    @Override
    public void updateState(double value, BinaryOperator nextOperation) {
        if(this.currentOperator == null){
            this.total = value;
        }else{
            this.total = this.currentOperator.calculate(total, value);
        }
        this.currentOperator = nextOperation;
    }

    @Override
    public double getCurrentValue() {
        return this.total;
    }
}
