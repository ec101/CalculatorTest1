package elr.calculatortest1.io;

import java.util.List;

/**
 * Created by Emmet on 13/11/2016.
 */

public class DefinedUserInputProvider implements UserInput {

    private final List<Double> values;

    public DefinedUserInputProvider(List<Double> values){
        super();
        this.values = values;
    }

    @Override
    public double getUserInput() {
        if(this.values.size() > 0) {
            return this.values.remove(0);
        }
        return 0;
    }

    @Override
    public void updateCurrentInput(double value) {

    }

    @Override
    public void clearCurrentInput() {

    }
}
