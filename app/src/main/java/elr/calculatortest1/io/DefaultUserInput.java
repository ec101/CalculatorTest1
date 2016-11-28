package elr.calculatortest1.io;

import java.math.BigDecimal;

import static android.os.Build.VERSION_CODES.BASE;

/**
 * Created by Emmet on 27/11/2016.
 */

public class DefaultUserInput implements UserInput {

    private BigDecimal currentInput;
    private boolean hasDecimalPoint;
    private BigDecimal decimal;

    public DefaultUserInput() {
        super();
        this.currentInput = BigDecimal.ZERO;
        this.decimal = BigDecimal.TEN;
    }

    public void updateCurrentInput(double value){
        BigDecimal userInputValue = new BigDecimal(value);
        if(hasDecimalPoint){
            userInputValue = userInputValue.divide(this.decimal);
            this.currentInput = this.currentInput.add(userInputValue);
            this.decimal = decimal.multiply(BigDecimal.TEN);
        }else{
            this.currentInput = this.currentInput.multiply(BigDecimal.TEN).add(userInputValue);
        }
    }

    @Override
    public void decimalPoint() {
        this.hasDecimalPoint = true;
    }

    public void clearCurrentInput(){
        this.currentInput = BigDecimal.ZERO;
    }

    public double getCurrentInput(){
        return this.currentInput.doubleValue();
    }
}
