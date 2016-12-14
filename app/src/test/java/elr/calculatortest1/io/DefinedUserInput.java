package elr.calculatortest1.io;

import java.util.List;

/**
 * Created by Emmet on 13/11/2016.
 */

public class DefinedUserInput implements UserInput {

    private final List<Double> values;

    public DefinedUserInput(List<Double> values){
        super();
        this.values = values;
    }

    @Override
    public double getCurrentInput() {
        if(this.values.size() > 0) {
            return this.values.remove(0);
        }
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void setNegativeNumber() {

    }

    @Override
    public void updateCurrentInput(int value) {

    }

    @Override
    public void setCurrentInput(double value) {

    }

    @Override
    public void decimalPoint() {

    }

    @Override
    public void clearCurrentInput() {

    }
}
