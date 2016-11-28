package elr.calculatortest1.io;

/**
 * Created by Emmet on 27/11/2016.
 */

public interface UserInput{

    void updateCurrentInput(double value);

    void decimalPoint();

    void clearCurrentInput();

    double getCurrentInput();
}
