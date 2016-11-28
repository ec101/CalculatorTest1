package elr.calculatortest1;

import android.util.Log;

/**
 * Created by roloughlin on 28/11/2016.
 */

public class DisplayStatus {

    private Double currentValue=0.0;
    private boolean decimalSet = false;
    private int decimalLevel = 0;

    void resetDisplayValue(){
        currentValue=0.0;
        decimalSet = false;
        decimalLevel = 1;
    }
    void setDisplayValue( Double value){
        currentValue=value;
    }
    Double returnDisplayValue(){
        return currentValue;
    }

    void setCurrentValue(Double value){
        if (currentValue==0.0 && !decimalSet) {
            currentValue = value;
        }
        else if (currentValue ==0.0 && decimalLevel==1){
            currentValue = value / 10.0;
            decimalLevel++;
        } else if (!decimalSet)
        {
            currentValue = currentValue * 10.0 + value;
        } else{
            currentValue = currentValue + (value / Math.pow(10,decimalLevel));
            decimalLevel++;
        }
    }
    void setDecimal () {
        decimalSet = true ;
    }

}
