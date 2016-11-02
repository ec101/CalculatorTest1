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

        //initSpinner();
        final Calculator calculator = new Calculator();


//        final Button calculateButton = (Button)findViewById(R.id.plus_button);
//        View.OnClickListener listener = new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//
//                EditText xValueTextField = (EditText)findViewById(R.id.xValue);
//                Integer xValue = getNumericValue(xValueTextField);
//
//                EditText yValueTextField = (EditText)findViewById(R.id.yValue);
//                Integer yValue = getNumericValue(yValueTextField);
//
//                Spinner spinner = (Spinner)findViewById(R.id.spinner);
//                Operator selectedOperator = Operator.getOperator((String)spinner.getSelectedItem());
//
//                Integer result = calculator.calculate(xValue, selectedOperator, yValue);
//
//                EditText resultTextField = (EditText)findViewById(R.id.resultValue);
//                resultTextField.setText(result.toString());
//            }
//        };
//        calculateButton.setOnClickListener(listener);
    }

    private Integer getNumericValue(EditText textField) {
        return Integer.valueOf(textField.getText().toString());
    }

//    private void initSpinner(){
//        Spinner spinner = (Spinner) findViewById(R.id.spinner);
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
//                R.array.operators, android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);
//    }
}
