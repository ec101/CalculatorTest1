package elr.calculatortest1.operator;

/**
 * Created by lquinn on 24/10/2016.
 */

public class PlusOperator extends AbstractBinaryOperator {

    public static final PlusOperator INSTANCE = new PlusOperator();

    private PlusOperator(){
        super();
    }

    @Override
    public Double calculate(Double x, Double y) {
        return x + y ;
    }
}
