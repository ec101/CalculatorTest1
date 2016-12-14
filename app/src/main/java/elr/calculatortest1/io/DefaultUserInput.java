package elr.calculatortest1.io;

import java.math.BigDecimal;

import elr.calculatortest1.R;

import static android.os.Build.VERSION_CODES.BASE;

/**
 * Created by Emmet on 27/11/2016.
 */

public class DefaultUserInput implements UserInput {

    private StringBuilder currentInput;
    private boolean negativeNumber;

    public DefaultUserInput() {
        super();
        this.currentInput = new StringBuilder();
    }

    @Override
    public boolean isEmpty() {
        return this.currentInput.length() == 0;
    }

    @Override
    public void setNegativeNumber() {
        this.negativeNumber = true;
    }

    public void updateCurrentInput(int value){
        if(this.isEmpty() && this.negativeNumber){
            this.currentInput.append('-');
        }
        this.currentInput.append(value);
    }

    @Override
    public void setCurrentInput(double value) {
        this.clearCurrentInput();
        this.currentInput.append(value);
    }

    @Override
    public void decimalPoint() {
        this.currentInput.append('.');
    }

    public void clearCurrentInput(){
        this.currentInput = new StringBuilder();
        this.negativeNumber = false;
    }

    public double getCurrentInput(){
        String value = currentInput.toString();
        if(value.equals("-")){
            return 0.0;
        }
        return Double.valueOf(value);
    }
}
