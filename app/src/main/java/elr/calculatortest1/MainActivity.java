package elr.calculatortest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import elr.calculatortest1.calculator.CalculatorState;
import elr.calculatortest1.calculator.DefaultCalculatorState;
import elr.calculatortest1.io.DefaultUserInput;
import elr.calculatortest1.io.DefaultUserInputProvider;
import elr.calculatortest1.io.DivideButtonHandler;
import elr.calculatortest1.io.EightInputHandlerImpl;
import elr.calculatortest1.io.EqualsButtonHandler;
import elr.calculatortest1.io.FiveInputHandlerImpl;
import elr.calculatortest1.io.FourInputHandlerImpl;
import elr.calculatortest1.io.MinusButtonHandler;
import elr.calculatortest1.io.MultiplyButtonHandler;
import elr.calculatortest1.io.NineInputHandlerImpl;
import elr.calculatortest1.io.NumberInputHandler;
import elr.calculatortest1.io.OneInputHandlerImpl;
import elr.calculatortest1.io.OperatorInputHandler;
import elr.calculatortest1.io.PlusButtonHandler;
import elr.calculatortest1.io.SevenInputHandlerImpl;
import elr.calculatortest1.io.SixInputHandlerImpl;
import elr.calculatortest1.io.ThreeInputHandlerImpl;
import elr.calculatortest1.io.TwoInputHandlerImpl;
import elr.calculatortest1.io.UserInput;
import elr.calculatortest1.io.ZeroInputHandlerImpl;

public class MainActivity extends AppCompatActivity {

    private final CalculatorState calculatorState;
    private DefaultUserInput userInput;
    private TextView inputField;

    public MainActivity(){
        this.calculatorState = new DefaultCalculatorState();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.inputField = (TextView)findViewById(R.id.edit_text);

        this.userInput = new DefaultUserInput();
        final OperatorInputHandler plusHandler = new PlusButtonHandler(calculatorState, this.userInput);
        final OperatorInputHandler minusHandler = new MinusButtonHandler(calculatorState, this.userInput);
        final OperatorInputHandler multiplyHandler = new MultiplyButtonHandler(calculatorState, this.userInput);
        final OperatorInputHandler divideHandler = new DivideButtonHandler(calculatorState, this.userInput);
        final OperatorInputHandler equalsHandler = new EqualsButtonHandler(calculatorState, this.userInput);
        final NumberInputHandler oneHandler = new OneInputHandlerImpl(this.userInput);
        final NumberInputHandler twoHandler = new TwoInputHandlerImpl(this.userInput);
        final NumberInputHandler threeHandler = new ThreeInputHandlerImpl(this.userInput);
        final NumberInputHandler fourHandler = new FourInputHandlerImpl(this.userInput);
        final NumberInputHandler fiveHandler = new FiveInputHandlerImpl(this.userInput);
        final NumberInputHandler sixHandler = new SixInputHandlerImpl(this.userInput);
        final NumberInputHandler sevenHandler = new SevenInputHandlerImpl(this.userInput);
        final NumberInputHandler eightHandler = new EightInputHandlerImpl(this.userInput);
        final NumberInputHandler nineHandler = new NineInputHandlerImpl(this.userInput);
        final NumberInputHandler zeroHandler = new ZeroInputHandlerImpl(this.userInput);

        final Button oneButton = (Button)findViewById(R.id.one_button);
        View.OnClickListener one_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                oneHandler.handleInput();
                updateDisplay(userInput.getCurrentInput());
            }
        };
        oneButton.setOnClickListener(one_listener);

        final Button twoButton = (Button)findViewById(R.id.two_button);
        View.OnClickListener two_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                twoHandler.handleInput();
                updateDisplay(userInput.getCurrentInput());
            }
        };
        twoButton.setOnClickListener(two_listener);

        final Button threeButton = (Button)findViewById(R.id.three_button);
        View.OnClickListener three_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                threeHandler.handleInput();
                updateDisplay(userInput.getCurrentInput());
            }
        };
        threeButton.setOnClickListener(three_listener);

        final Button fourButton = (Button)findViewById(R.id.four_button);
        View.OnClickListener four_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                fourHandler.handleInput();
                updateDisplay(userInput.getCurrentInput());
            }
        };
        fourButton.setOnClickListener(four_listener);

        final Button fiveButton = (Button)findViewById(R.id.five_button);
        View.OnClickListener five_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                fiveHandler.handleInput();
                updateDisplay(userInput.getCurrentInput());
            }
        };
        fiveButton.setOnClickListener(five_listener);

        final Button sixButton = (Button)findViewById(R.id.six_button);
        View.OnClickListener six_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                sixHandler.handleInput();
                updateDisplay(userInput.getCurrentInput());
            }
        };
        sixButton.setOnClickListener(six_listener);

        final Button sevenButton = (Button)findViewById(R.id.seven_button);
        View.OnClickListener seven_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                sevenHandler.handleInput();
                updateDisplay(userInput.getCurrentInput());
            }
        };
        sevenButton.setOnClickListener(seven_listener);

        final Button eightButton = (Button)findViewById(R.id.eight_button);
        View.OnClickListener eight_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                eightHandler.handleInput();
                updateDisplay(userInput.getCurrentInput());
            }
        };
        eightButton.setOnClickListener(eight_listener);

        final Button nineButton = (Button)findViewById(R.id.nine_button);
        View.OnClickListener nine_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                nineHandler.handleInput();
                updateDisplay(userInput.getCurrentInput());
            }
        };
        nineButton.setOnClickListener(nine_listener);

        final Button zeroButton = (Button)findViewById(R.id.zero_button);
        View.OnClickListener zero_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                zeroHandler.handleInput();
                updateDisplay(userInput.getCurrentInput());
            }
        };
        zeroButton.setOnClickListener(zero_listener);

        final Button plusButton = (Button)findViewById(R.id.plus_button);
        View.OnClickListener plus_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                plusHandler.handleInput();
                updateDisplay(calculatorState.getCurrentValue());
            }
        };
        plusButton.setOnClickListener(plus_listener);

        final Button minusButton = (Button)findViewById(R.id.minus_button);
        View.OnClickListener minus_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                minusHandler.handleInput();
                updateDisplay(calculatorState.getCurrentValue());
            }
        };
        minusButton.setOnClickListener(minus_listener);

        final Button multiplyButton = (Button)findViewById(R.id.multiply_button);
        View.OnClickListener multiply_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                multiplyHandler.handleInput();
                updateDisplay(calculatorState.getCurrentValue());
            }
        };
        multiplyButton.setOnClickListener(multiply_listener);

        final Button divideButton = (Button)findViewById(R.id.divide_button);
        View.OnClickListener divide_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                divideHandler.handleInput();
                updateDisplay(calculatorState.getCurrentValue());
            }
        };
        divideButton.setOnClickListener(divide_listener);

        final Button equalsButton = (Button)findViewById(R.id.equals_button);
        View.OnClickListener equals_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                equalsHandler.handleInput();
                updateDisplay(calculatorState.getCurrentValue());
            }
        };
        equalsButton.setOnClickListener(equals_listener);

        final Button clearButton = (Button)findViewById(R.id.clear_button);
        View.OnClickListener clear_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                clearDisplay();
                userInput.clearCurrentInput();
            }
        };
        clearButton.setOnClickListener(clear_listener);
    }

    private void updateDisplay(double value) {
        this.inputField.setText(Double.toString(value));
    }

    private void clearDisplay() {
        this.inputField.setText("0.0");
    }
}