package elr.calculatortest1.io;

import android.widget.EditText;

import elr.calculatortest1.io.UserInputProvider;

public class DefaultUserInputProvider implements UserInputProvider, OutputDisplay {

    private final EditText userDisplay;

    public DefaultUserInputProvider(EditText userDisplay){
        this.userDisplay = userDisplay;
    }

    @Override
    public double getUserInput(){
        return Double.valueOf(this.userDisplay.getText().toString());
    }

    @Override
    public void displayData(double value) {
        this.userDisplay.setText(Double.toString(value));
    }
}
