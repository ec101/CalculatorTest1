package elr.calculatortest1;

/**
 * Created by Emmet on 23/10/2016.
 */

public enum Operator {

    PLUS, MINUS, MULTIPLY, DIVIDE;

    static Operator getOperator(String strValue){
        if("+".equals(strValue)){
            return PLUS;
        }else if("-".equals(strValue)){
            return MINUS;
        }else if("*".equals(strValue)){
            return MULTIPLY;
        }
        return DIVIDE;
    }
}
