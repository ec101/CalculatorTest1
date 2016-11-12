package elr.calculatortest1.operator;

public class MinusOperator extends AbstractBinaryOperator {

    public static final MinusOperator INSTANCE = new MinusOperator();

    private MinusOperator(){
        super();
    }

    @Override
    public Double calculate(Double x, Double y) {
        return x-y;
    }

}
