package elr.calculatortest1;

/**
 * Created by lquinn on 24/10/2016.
 */

class PlusOperator extends AbstractBinaryOperator {
    @Override
    public Double calculate(Double x, Double y) {
        return x + y ;
    }
}
