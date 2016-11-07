package elr.calculatortest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserInputParser inputParser = new UserInputParser(this);

        final Button plusButton = (Button)findViewById(R.id.plus_button);
        View.OnClickListener plus_listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //// TODO: 07/11/2016  
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
            }
        };
        equalsButton.setOnClickListener(equals_listener);
    }
}
