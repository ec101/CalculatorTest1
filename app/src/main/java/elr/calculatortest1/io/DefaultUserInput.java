package elr.calculatortest1.io;

/**
 * Created by Emmet on 27/11/2016.
 */

public class DefaultUserInput implements UserInput, UserInputProvider{

    private static final double BASE = 10;

    private double currentInput;

    public DefaultUserInput() {
        super();
        this.currentInput = 0.0;
    }

    public void updateCurrentInput(double value){
        this.currentInput = (this.currentInput * BASE) + value;
    }

    public void clearCurrentInput(){
        this.currentInput = 0.0;
    }

    public double getCurrentInput(){
        return this.currentInput;
    }

    @Override
    public double getUserInput() {
        return this.currentInput;
    }
}
