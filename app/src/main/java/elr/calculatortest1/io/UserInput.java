package elr.calculatortest1.io;

/**
 * Created by Emmet on 27/11/2016.
 */

public interface UserInput extends UserInputProvider{

    public void updateCurrentInput(double value);

    public void clearCurrentInput();
}
