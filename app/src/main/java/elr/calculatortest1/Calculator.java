package elr.calculatortest1;

/**
 * Created by Emmet on 23/10/2016.
 */

class Calculator {

    private double total = 0;
    private Operator currentOperator = null;


    Integer calculate(Integer xValue, Operator operator, Integer yValue){
        if(Operator.PLUS.equals(operator)){
            return add(xValue, yValue);
        }else if(Operator.MINUS.equals(operator)){
            return subtract(xValue, yValue);
        }else if(Operator.MULTIPLY.equals(operator)){
            return multiply(xValue, yValue);
        }else{
            return divide(xValue, yValue);
        }
    }

    private Integer divide(Integer xValue, Integer yValue) {
        return Integer.valueOf(xValue.intValue() / yValue.intValue());
    }

    private Integer multiply(Integer xValue, Integer yValue) {
        return Integer.valueOf(xValue.intValue() * yValue.intValue());
    }

    private Integer subtract(Integer xValue, Integer yValue) {
        return Integer.valueOf(xValue.intValue() - yValue.intValue());
    }

    private Integer add(Integer xValue, Integer yValue) {
        return Integer.valueOf(xValue.intValue() + yValue.intValue());
    }
}
