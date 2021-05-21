package com.example.rewilding_calculator;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String Tag = "MainActivity";//Only needed for debugging
    public Calculation calc = new Calculation(); //Object declared globally
    public int stage = 0; //Will move to calculation class at some point


    //    ListView output = findViewById(R.id.listview);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Declare the starting layout
        EditText input = findViewById(R.id.editTextNumber);//Define input box
//        Button b1 = findViewById(R.id.button);//
        TextView working = findViewById(R.id.textView);
        TextView display = findViewById(R.id.textView2); //Define the output box

        input.setOnEditorActionListener(editorActionListener); //listener for when enter is pressed

    }

    /**
     * When Enter is pressed, the following code will run
     */
    private TextView.OnEditorActionListener editorActionListener = new TextView.OnEditorActionListener() {
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            TextView working = findViewById(R.id.textView);
//            Log.d();
            Log.d(Tag, "Enter Pressed");//debug log


//            calc.setCost(calc.getCost() + Double.parseDouble(String.valueOf(v.getText())));//increase cost in calculation by the value entered by the user
//            calc.setCost(calc.getCost() + 2);
            Log.d(Tag, "Count" + String.valueOf(calc.getCost()));//debug log
            working.setText(working.getText()+"\n"+String.valueOf(Calculate(Double.parseDouble(String.valueOf(v.getText())))));
            return false;
        }
    };

    /**
     * Calls the relevant calculation according to the step
     * @param input
     * @return output from Calculation class
     */
    public double Calculate(double input) {

        if (stage == 0) {
//            stage++;

            NextStep();
            return calc.getAirMiles(input);
        } else if (stage == 1) {
//            stage++;
            NextStep();
            return calc.getCarMiles(input);
        } else if (stage == 2) {
//            stage++;
            NextStep();
        } else if (stage == 3) {
//            stage++;
            NextStep();
        }


//        stage--;
        return -1;
    }

    /**
     * Changes the user prompt
     * Increments the step counter
     */
    public void NextStep() {
        TextView display = findViewById(R.id.textView2); //Define the output box in this scope
        EditText input = findViewById(R.id.editTextNumber);//Define input box in this scope
        if (stage == 0) {
            display.setText(getString(R.string.Question2));
        } else if (stage == 1) {
            display.setText(getString(R.string.Question3));
        } else if (stage == 2) {
            display.setText(getString(R.string.Question4));
        } else if (stage == 3) {
            display.setText(getString(R.string.Question5));
        }
        stage++;

    }
}