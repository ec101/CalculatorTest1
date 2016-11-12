package elr.calculatortest1.operator;

/**
 * Created by lquinn on 25/10/2016.
 * Adding the Multiply class
 */

public class MultiplyOperator extends AbstractBinaryOperator {

    public static final MultiplyOperator INSTANCE = new MultiplyOperator();

    private MultiplyOperator(){
        super();
    }

    @Override
    public Double calculate(Double x, Double y) {
        return x * y ;
    }
}
