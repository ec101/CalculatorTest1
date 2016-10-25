package elr.calculatortest1;

/**
 * Created by lquinn on 25/10/2016.
 * Adding the Multiply class
 */

class MultiplyOperator extends AbstractBinaryOperator {
    @Override
    public Double calculate(Double x, Double y) {
        return x * y ;
    }
}
