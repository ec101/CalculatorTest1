package elr.calculatortest1;

import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class DefaultUserInputProvider implements UserInputProvider{

    private final AppCompatActivity activity;

    public DefaultUserInputProvider(AppCompatActivity activity){
        this.activity = activity;
    }

    @Override
    public double getUserInput(){
        EditText inputField = (EditText)activity.findViewById(R.id.edit_text);
        return Double.valueOf(inputField.getText().toString());
    }
}
