package elr.calculatortest1.io;

/**
 * Created by Emmet on 13/11/2016.
 */
class DummyUserInputProvider implements UserInput {

    @Override
    public double getUserInput() {
        return 2.0;
    }

    @Override
    public void updateCurrentInput(double value) {

    }

    @Override
    public void clearCurrentInput() {

    }
}
