package elr.calculatortest1;

/**
 * Created by roryo on 27/10/2016.
 */

class DivideOperator extends AbstractBinaryOperator {
    @Override
    public Double calculate(Double x, Double y) {
        if (y ==0.0) {
            return Double.NaN;
        }
        return x/y;
    }
}
