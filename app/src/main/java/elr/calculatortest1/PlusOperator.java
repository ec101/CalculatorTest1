package elr.calculatortest1;

/**
 * Created by lquinn on 24/10/2016.
 */

class PlusOperator extends AbstractBinaryOperator {

    public static final PlusOperator PLUS_OPERATOR = new PlusOperator();

    private PlusOperator(){
        super();
    }

    @Override
    public Double calculate(Double x, Double y) {
        return x + y ;
    }
}
