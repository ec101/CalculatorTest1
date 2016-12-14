package elr.calculatortest1.io;

/**
 * Created by Emmet on 13/11/2016.
 */
class DummyUserInput implements UserInput {

    @Override
    public double getCurrentInput() {
        return 2.0;
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
