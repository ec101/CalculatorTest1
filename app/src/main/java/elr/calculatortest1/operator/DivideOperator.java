package elr.calculatortest1.operator;

/**
 * Created by roryo on 27/10/2016.
 */

public class DivideOperator extends AbstractBinaryOperator {

    public static final DivideOperator INSTANCE = new DivideOperator();

    private DivideOperator(){
        super();
    }

    @Override
    public Double calculate(Double x, Double y) {
        if (y ==0.0) {
            return Double.NaN;
        }
        return x/y;
    }
}
