package elr.calculatortest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import elr.calculatortest1.calculator.CalculatorState;
import elr.calculatortest1.calculator.DefaultCalculatorState;
import elr.calculatortest1.io.DefaultUserInputProvider;
import elr.calculatortest1.io.DivideButtonHandler;
import elr.calculatortest1.io.EqualsButtonHandler;
import elr.calculatortest1.io.MinusButtonHandler;
import elr.calculatortest1.io.MultiplyButtonHandler;
import elr.calculatortest1.io.OperatorInputHandler;
import elr.calculatortest1.io.PlusButtonHandler;

public class MainActivity extends AppCompatActivity {

    private final CalculatorState calculatorState;
    private DefaultUserInputProvider inputProvider;

    public MainActivity(){
        this.calculatorState = new DefaultCalculatorState();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputField = (EditText)findViewById(R.id.edit_text);
        inputProvider = new DefaultUserInputProvider(inputField);
        final OperatorInputHandler plusHandler = new PlusButtonHandler(calculatorState, inputProvider);
        final OperatorInputHandler minusHandler = new MinusButtonHandler(calculatorState, inputProvider);
        final OperatorInputHandler multiplyHandler = new MultiplyButtonHandler(calculatorState, inputProvider);
        final OperatorInputHandler divideHandler = new DivideButtonHandler(calculatorState, inputProvider);
        final OperatorInputHandler equalsHandler = new EqualsButtonHandler(calculatorState, inputProvider);

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
                minusHandler.handleInput();
                updateDisplay();
            }
        };
        minusButton.setOnClickListener(minus_listener);

        final Button multiplyButton = (Button)findViewById(R.id.multiply_button);
        View.OnClickListener multiply_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                multiplyHandler.handleInput();
                updateDisplay();
            }
        };
        multiplyButton.setOnClickListener(multiply_listener);

        final Button divideButton = (Button)findViewById(R.id.divide_button);
        View.OnClickListener divide_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                divideHandler.handleInput();
                updateDisplay();
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
        inputProvider.displayData(this.calculatorState.getCurrentValue());
    }
}
