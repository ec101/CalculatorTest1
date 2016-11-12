package elr.calculatortest1.operator;

/**
 * Created by lquinn on 24/10/2016.
 */

public interface BinaryOperator extends NumericOperator {

    Double calculate(Double x, Double y);
}
