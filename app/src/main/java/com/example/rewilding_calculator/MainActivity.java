package com.example.rewilding_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input = findViewById(R.id.editTextNumber);
//        KeyListener enter = KeyEvent.KEYCODE_NUMPAD_ENTER;

//        input.setKeyListener(KeyListener(KeyEvent.KEYCODE_NUMPAD_ENTER));

        Button b1 = findViewById(R.id.button);
        TextView display = findViewById(R.id.textView2);

        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (Integer.parseInt(String.valueOf(input.getText())) > 0) {
                    display.setText("You must pay £" + String.valueOf(Math.random()*10000));
                }
            }
        });
    }
}



