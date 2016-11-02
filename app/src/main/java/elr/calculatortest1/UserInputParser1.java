package elr.calculatortest1;

import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class UserInputParser {

    private final AppCompatActivity activity;

    public UserInputParser(AppCompatActivity activity){
        this.activity = activity;
    }

    public double getUserInput(){
        EditText inputField = (EditText)activity.findViewById(R.id.edit_text);
        return Double.valueOf(inputField.getText().toString());
    }
}
