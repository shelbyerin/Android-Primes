package cosc426.assign1part6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void run(View v){
        EditText primeEditText = (EditText)findViewById(R.id.numberInput); //gets the editText box
        String primeString = primeEditText.getText().toString(); //gets the text from the editText box
        int numberPrime = Integer.parseInt(primeString); //gets the int value  that will be used from the input

        PrimeListGenerator generator = new PrimeListGenerator();
        generator.set(numberPrime); //sets the input value to the numberPrime in the generator file
        String listPrimes = generator.get(); //sets the listPrimes equal to the return of the get method in the generator file

        TextView primeTextView = (TextView)findViewById(R.id.outputPrimes); //gets the textView box from UI
        primeTextView.setText(listPrimes); //sets the listPrimes to the text for that textView box to display the results
    }
}
