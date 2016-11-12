package elr.calculatortest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private CalculatorState calculatorState;

    public MainActivity(){
        this.calculatorState = new DefaultCalculatorState();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DefaultUserInputProvider inputParser = new DefaultUserInputProvider(this);
        final PlusButtonHandler plusHandler = new PlusButtonHandler(calculatorState, inputParser);
        final EqualsButtonHandler equalsHandler = new EqualsButtonHandler(calculatorState, inputParser);

        final Button plusButton = (Button)findViewById(R.id.plus_button);
        View.OnClickListener plus_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                plusHandler.handleInput();
                updateDisplay();
            }
        };
        plusButton.setOnClickListener(plus_listener);

        final Button minusButton = (Button)findViewById(R.id.minus_button);
        View.OnClickListener minus_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            }
        };
        minusButton.setOnClickListener(minus_listener);

        final Button multiplyButton = (Button)findViewById(R.id.multiply_button);
        View.OnClickListener multiply_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            }
        };
        multiplyButton.setOnClickListener(multiply_listener);

        final Button divideButton = (Button)findViewById(R.id.divide_button);
        View.OnClickListener divide_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            }
        };
        divideButton.setOnClickListener(divide_listener);

        final Button equalsButton = (Button)findViewById(R.id.equals_button);
        View.OnClickListener equals_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                equalsHandler.handleInput();
                updateDisplay();
            }
        };
        equalsButton.setOnClickListener(equals_listener);
    }

    private void updateDisplay() {
        EditText textField = (EditText)findViewById(R.id.edit_text);
            textField.setText(Double.toString(this.calculatorState.getCurrentValue()));
    }
}
