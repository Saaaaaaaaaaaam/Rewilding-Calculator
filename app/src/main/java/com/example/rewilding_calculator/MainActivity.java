package com.example.rewilding_calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String Tag = "MainActivity";//Only needed for debugging
    public Calculation calc = new Calculation(); //Object declared globally
    public int stage = 0;
    TextView display = findViewById(R.id.textView2); //Define the output box

    //    ListView output = findViewById(R.id.listview);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Declare the starting layout
        EditText input = findViewById(R.id.editTextNumber);//Define input box
//        Button b1 = findViewById(R.id.button);//
        TextView working = findViewById(R.id.textView);


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
            working.setText( String.valueOf(Calculate(Double.parseDouble(String.valueOf(v.getText())))));
            return false;
        }
    };

    public double Calculate(double input) {

        if (stage == 0) {
//            stage++;
            NextStep();
            return calc.getAirMiles(input);
        } else if (stage == 1) {
//            stage++;

        }


//        stage--;
        return -1;
    }

    public void NextStep(){
        if(stage==0){
            display.setText("PLACEHOLDER");
        }
        stage++;

    }
}