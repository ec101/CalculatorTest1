package elr.calculatortest1.io;

/**
 * Created by Emmet on 27/11/2016.
 */

public interface UserInput{

    boolean isEmpty();

    void setNegativeNumber();

    void updateCurrentInput(int value);

    void setCurrentInput(double value);

    void decimalPoint();

    void clearCurrentInput();

    double getCurrentInput();
}
