package elr.calculatortest1;

import android.util.Log;

/**
 * Created by roryo on 10/11/2016.
 */

public class CalculatorStatus {
    private Double total=0.0;
    private String currentOperator="empty";

    void printTotal (){
        System.out.println(total);
    }
    void updateTotal(Double newTotal ){
        total = newTotal;
    }
    Double returnTotal () {
        Log.i("MyApp", "I am returning the new total"+total.toString());
        return total;
    }

    void resetStatus() {
        total = 0.0;
        currentOperator="empty";
    }
    private void computeNew (Double value) {

        switch (currentOperator){
            case "plus" :
                PlusOperator myPlusOperator = new PlusOperator();
                total = myPlusOperator.calculate(total,value);
                Log.i("MyApp", "I have recognised that this is a plus"+total.toString()+" "+value.toString());
                break;
            case "minus" :
                MinusOperator myMinusOperator = new MinusOperator();
                total = myMinusOperator.calculate(total,value);
                break;
            case "multiply" :
                MultiplyOperator myMultiplyOperator = new MultiplyOperator();
                total = myMultiplyOperator.calculate(total,value);
                break;
            case "divide" :
                DivideOperator myDivideOperator = new DivideOperator();
                total = myDivideOperator.calculate(total,value);
                break;
            default :
                total = value;
        }
    }

    void addPlus (Double value) {
        Log.i("MyApp", "Entering the class, the value of total is"+total.toString()+" "+value.toString());
        computeNew(value);
        currentOperator="plus";

    }
    void addMinus (Double value) {
        Log.i("MyApp", "Entering the class, the value of total is"+total.toString()+" "+value.toString());
        computeNew(value);
        currentOperator="minus";
    }
    void addMultiply (Double value) {
        Log.i("MyApp", "Entering the class, the value of total is"+total.toString()+" "+value.toString());
        computeNew(value);
        currentOperator="multiply";
    }
    void addDivide (Double value) {
        Log.i("MyApp", "Entering the class, the value of total is"+total.toString()+" "+value.toString());
        computeNew(value);
        currentOperator="divide";
    }
    void equals (Double value) {
        Log.i("MyApp", "Entering the class, the value of total is"+total.toString()+" "+value.toString());
        computeNew(value);
        currentOperator="empty";

    }

}
