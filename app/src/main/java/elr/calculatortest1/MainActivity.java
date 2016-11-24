package elr.calculatortest1;

import android.net.Uri;
import android.provider.Settings;
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

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView resultTextField = (TextView) findViewById(R.id.edit_text);

        final CalculatorStatus myStatus = new CalculatorStatus();
  //      final UserInputParser inputParser = new UserInputParser(this);
        final Button plusButton = (Button) findViewById(R.id.plus_button);
        View.OnClickListener plus_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i("MyApp", "I am here performing the addition");
                myStatus.addPlus();
                resultTextField.setText(myStatus.returnTotal().toString());
            }
        };
        plusButton.setOnClickListener(plus_listener);

        final Button minusButton = (Button) findViewById(R.id.minus_button);
        View.OnClickListener minus_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStatus.addMinus();
                resultTextField.setText(myStatus.returnTotal().toString());
            }
        };
        minusButton.setOnClickListener(minus_listener);

        final Button multiplyButton = (Button) findViewById(R.id.multiply_button);
        View.OnClickListener multiply_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStatus.addMultiply();
                resultTextField.setText(myStatus.returnTotal().toString());
            }
        };
        multiplyButton.setOnClickListener(multiply_listener);

        final Button divideButton = (Button) findViewById(R.id.divide_button);
        View.OnClickListener divide_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStatus.addDivide();
                resultTextField.setText(myStatus.returnTotal().toString());
            }
        };
        divideButton.setOnClickListener(divide_listener);



        final Button oneButton = (Button) findViewById(R.id.one_button);
        View.OnClickListener one_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStatus.setCurrentValue(1.0);
                resultTextField.setText(myStatus.returnCurrentValue().toString());
            }
        };
        oneButton.setOnClickListener(one_listener);

        final Button twoButton = (Button) findViewById(R.id.two_button);
        View.OnClickListener two_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStatus.setCurrentValue(2.0);
                resultTextField.setText(myStatus.returnCurrentValue().toString());
            }
        };
        twoButton.setOnClickListener(two_listener);

        final Button threeButton = (Button) findViewById(R.id.three_button);
        View.OnClickListener three_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStatus.setCurrentValue(3.0);
                resultTextField.setText(myStatus.returnCurrentValue().toString());
            }
        };
        threeButton.setOnClickListener(three_listener);

        final Button fourButton = (Button) findViewById(R.id.four_button);
        View.OnClickListener four_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStatus.setCurrentValue(4.0);
                resultTextField.setText(myStatus.returnCurrentValue().toString());
            }
        };
        fourButton.setOnClickListener(four_listener);

        final Button fiveButton = (Button) findViewById(R.id.five_button);
        View.OnClickListener five_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStatus.setCurrentValue(5.0);
                resultTextField.setText(myStatus.returnCurrentValue().toString());
            }
        };
        fiveButton.setOnClickListener(five_listener);

        final Button sixButton = (Button) findViewById(R.id.six_button);
        View.OnClickListener six_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStatus.setCurrentValue(6.0);
                resultTextField.setText(myStatus.returnCurrentValue().toString());
            }
        };
        sixButton.setOnClickListener(six_listener);

        final Button sevenButton = (Button) findViewById(R.id.seven_button);
        View.OnClickListener seven_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStatus.setCurrentValue(7.0);
                resultTextField.setText(myStatus.returnCurrentValue().toString());
            }
        };
        sevenButton.setOnClickListener(seven_listener);

        final Button eightButton = (Button) findViewById(R.id.eight_button);
        View.OnClickListener eight_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStatus.setCurrentValue(8.0);
                resultTextField.setText(myStatus.returnCurrentValue().toString());
            }
        };
        eightButton.setOnClickListener(eight_listener);

        final Button nineButton = (Button) findViewById(R.id.nine_button);
        View.OnClickListener nine_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStatus.setCurrentValue(9.0);
                resultTextField.setText(myStatus.returnCurrentValue().toString());
            }
        };
        nineButton.setOnClickListener(nine_listener);
        
        
        final Button equalsButton = (Button) findViewById(R.id.equals_button);
        View.OnClickListener equals_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myStatus.equals();
                resultTextField.setText(myStatus.returnTotal().toString());
            }
        };
        equalsButton.setOnClickListener(equals_listener);
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

