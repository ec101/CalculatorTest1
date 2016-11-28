package elr.calculatortest1;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.icu.text.DecimalFormat;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.math.RoundingMode;

import static java.math.RoundingMode.*;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @TargetApi(Build.VERSION_CODES.N)
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView resultTextField = (TextView) findViewById(R.id.edit_text);
        final DisplayStatus myDisplay = new DisplayStatus();
        final CalculatorStatus myStatus = new CalculatorStatus();


  //      final UserInputParser inputParser = new UserInputParser(this);

        final Button plusButton = (Button) findViewById(R.id.plus_button);
        View.OnClickListener plus_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i("MyApp", "I am here performing the addition");
                myStatus.addPlus(myDisplay.returnDisplayValue());
                myDisplay.resetDisplayValue();
                resultTextField.setText(myStatus.returnTotal().toString());
                resultTextField.setTextColor(Color.BLUE);
            }
        };
        plusButton.setOnClickListener(plus_listener);

        final Button minusButton = (Button) findViewById(R.id.minus_button);
        View.OnClickListener minus_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStatus.addMinus(myDisplay.returnDisplayValue());
                myDisplay.resetDisplayValue();
                resultTextField.setText(myStatus.returnTotal().toString());
                resultTextField.setTextColor(Color.BLUE);
            }
        };
        minusButton.setOnClickListener(minus_listener);

        final Button multiplyButton = (Button) findViewById(R.id.multiply_button);
        View.OnClickListener multiply_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStatus.addMultiply(myDisplay.returnDisplayValue());
                myDisplay.resetDisplayValue();
                resultTextField.setText(myStatus.returnTotal().toString());
                resultTextField.setTextColor(Color.BLUE);
            }
        };
        multiplyButton.setOnClickListener(multiply_listener);

        final Button divideButton = (Button) findViewById(R.id.divide_button);
        View.OnClickListener divide_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStatus.addDivide(myDisplay.returnDisplayValue());
                myDisplay.resetDisplayValue();
                resultTextField.setText(myStatus.returnTotal().toString());
                resultTextField.setTextColor(Color.BLUE);
            }
        };
        divideButton.setOnClickListener(divide_listener);



        final Button oneButton = (Button) findViewById(R.id.one_button);
        View.OnClickListener one_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDisplay.setCurrentValue(1.0);
                resultTextField.setText(myDisplay.returnDisplayValue().toString());
                resultTextField.setTextColor(Color.GRAY);
            }
        };
        oneButton.setOnClickListener(one_listener);

        final Button twoButton = (Button) findViewById(R.id.two_button);
        View.OnClickListener two_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDisplay.setCurrentValue(2.0);
                resultTextField.setText(myDisplay.returnDisplayValue().toString());
                resultTextField.setTextColor(Color.GRAY);
            }
        };
        twoButton.setOnClickListener(two_listener);

        final Button threeButton = (Button) findViewById(R.id.three_button);
        View.OnClickListener three_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDisplay.setCurrentValue(3.0);
                resultTextField.setText(myDisplay.returnDisplayValue().toString());
                resultTextField.setTextColor(Color.GRAY);
            }
        };
        threeButton.setOnClickListener(three_listener);

        final Button fourButton = (Button) findViewById(R.id.four_button);
        View.OnClickListener four_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDisplay.setCurrentValue(4.0);
                resultTextField.setText(myDisplay.returnDisplayValue().toString());
                resultTextField.setTextColor(Color.GRAY);
            }
        };
        fourButton.setOnClickListener(four_listener);

        final Button fiveButton = (Button) findViewById(R.id.five_button);
        View.OnClickListener five_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDisplay.setCurrentValue(5.0);
                resultTextField.setText(myDisplay.returnDisplayValue().toString());
                resultTextField.setTextColor(Color.GRAY);
            }
        };
        fiveButton.setOnClickListener(five_listener);

        final Button sixButton = (Button) findViewById(R.id.six_button);
        View.OnClickListener six_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDisplay.setCurrentValue(6.0);
                resultTextField.setText(myDisplay.returnDisplayValue().toString());
                resultTextField.setTextColor(Color.GRAY);
            }
        };
        sixButton.setOnClickListener(six_listener);

        final Button sevenButton = (Button) findViewById(R.id.seven_button);
        View.OnClickListener seven_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDisplay.setCurrentValue(7.0);
                resultTextField.setText(myDisplay.returnDisplayValue().toString());
                resultTextField.setTextColor(Color.GRAY);
            }
        };
        sevenButton.setOnClickListener(seven_listener);

        final Button eightButton = (Button) findViewById(R.id.eight_button);
        View.OnClickListener eight_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDisplay.setCurrentValue(8.0);
                resultTextField.setText(myDisplay.returnDisplayValue().toString());
                resultTextField.setTextColor(Color.GRAY);
            }
        };
        eightButton.setOnClickListener(eight_listener);

        final Button nineButton = (Button) findViewById(R.id.nine_button);
        View.OnClickListener nine_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDisplay.setCurrentValue(9.0);
                resultTextField.setText(myDisplay.returnDisplayValue().toString());
                resultTextField.setTextColor(Color.GRAY);
            }
        };
        nineButton.setOnClickListener(nine_listener);

        final Button zeroButton = (Button) findViewById(R.id.zero_button);
        View.OnClickListener zero_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDisplay.setCurrentValue(0.0);
                resultTextField.setText(myDisplay.returnDisplayValue().toString());
                resultTextField.setTextColor(Color.GRAY);
            }
        };
        zeroButton.setOnClickListener(zero_listener);

        final Button equalsButton = (Button) findViewById(R.id.equals_button);
        View.OnClickListener equals_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStatus.equals(myDisplay.returnDisplayValue());
                myDisplay.setDisplayValue(myStatus.returnTotal());
                resultTextField.setText(myStatus.returnTotal().toString());
                resultTextField.setTextColor(Color.BLUE);
            }
        };
        equalsButton.setOnClickListener(equals_listener);

        final Button clearButton = (Button) findViewById(R.id.clear_button);
        View.OnClickListener clear_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStatus.resetStatus();
                myDisplay.resetDisplayValue();
                resultTextField.setText(myStatus.returnTotal().toString());
                resultTextField.setTextColor(Color.GRAY);
            }
        };


        clearButton.setOnClickListener(clear_listener);

        final Button decimalButton = (Button) findViewById(R.id.decimal_button);
        View.OnClickListener decimal_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDisplay.setDecimal();
                resultTextField.setText(myDisplay.returnDisplayValue().toString());
                resultTextField.setTextColor(Color.GRAY);
            }
        };

        decimalButton.setOnClickListener(decimal_listener);


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }


}

