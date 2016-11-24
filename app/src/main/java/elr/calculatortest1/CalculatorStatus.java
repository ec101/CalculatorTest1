package elr.calculatortest1;

import android.util.Log;

/**
 * Created by roryo on 10/11/2016.
 */

public class CalculatorStatus {
    private Double total=0.0;
    private Double currentValue=0.0;
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
    Double returnCurrentValue() {
        return currentValue;
    }

    void setCurrentValue(Double value){
        if (currentValue==0.0) {
            currentValue = value;
        }
        else
        {
            currentValue = currentValue * 10.0 + value;
        }
    }
    private void computeNew () {

        switch (currentOperator){
            case "plus" :
                PlusOperator myPlusOperator = new PlusOperator();
                total = myPlusOperator.calculate(total,currentValue);
                Log.i("MyApp", "I have recognised that this is a plus"+total.toString()+" "+currentValue.toString());
                break;
            case "minus" :
                MinusOperator myMinusOperator = new MinusOperator();
                total = myMinusOperator.calculate(total,currentValue);
                break;
            case "multiply" :
                MultiplyOperator myMultiplyOperator = new MultiplyOperator();
                total = myMultiplyOperator.calculate(total,currentValue);
                break;
            case "divide" :
                DivideOperator myDivideOperator = new DivideOperator();
                total = myDivideOperator.calculate(total,currentValue);
                break;
            default :
                total = currentValue;
        }
    }

    void addPlus () {
        Log.i("MyApp", "Entering the class, the value of total is"+total.toString()+" "+currentValue.toString());
        computeNew();
        currentOperator="plus";
        currentValue=0.0;
    }
    void addMinus () {
        Log.i("MyApp", "Entering the class, the value of total is"+total.toString()+" "+currentValue.toString());
        computeNew();
        currentOperator="minus";
        currentValue=0.0;
    }
    void addMultiply () {
        Log.i("MyApp", "Entering the class, the value of total is"+total.toString()+" "+currentValue.toString());
        computeNew();
        currentOperator="multiply";
        currentValue=0.0;
    }
    void addDivide () {
        Log.i("MyApp", "Entering the class, the value of total is"+total.toString()+" "+currentValue.toString());
        computeNew();
        currentOperator="divide";
        currentValue=0.0;
    }
    void equals () {
        Log.i("MyApp", "Entering the class, the value of total is"+total.toString()+" "+currentValue.toString());
        computeNew();
        currentOperator="empty";
        currentValue=0.0;
    }

}
