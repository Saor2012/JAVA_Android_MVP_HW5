package com.example.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    //Button []buttons = {};
    Button btn, cancel, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }*/
        btn = (Button)findViewById(R.id.button17);
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.button4);
        btn5 = (Button)findViewById(R.id.button5);
        btn6 = (Button)findViewById(R.id.button6);
        btn7 = (Button)findViewById(R.id.button7);
        btn8 = (Button)findViewById(R.id.button8);
        btn9 = (Button)findViewById(R.id.button9);
        btn0 = (Button)findViewById(R.id.button12);
        cancel = (Button)findViewById(R.id.button10);
        text1 = (TextView) findViewById(R.id.textView3);
        //buttons = {btn1, btn2, }

        btn.setOnClickListener((v) -> {
            text1.setText(GetResultString(text2.getText().toString()));
        }
                /*new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        text1.setText(GetResultString(text2.getText().toString()));
                    }
                }*/

        );
        btn1.setOnClickListener(v -> text1.setText(GetResultString(btn1.getText().toString())));
        btn2.setOnClickListener(v -> text1.setText(GetResultString(btn2.getText().toString())));
        btn3.setOnClickListener(v -> text1.setText(GetResultString(btn3.getText().toString())));
        btn4.setOnClickListener(v -> text1.setText(GetResultString(btn4.getText().toString())));
        btn5.setOnClickListener(v -> text1.setText(GetResultString(btn5.getText().toString())));
        btn6.setOnClickListener(v -> text1.setText(GetResultString(btn6.getText().toString())));
        btn7.setOnClickListener(v -> text1.setText(GetResultString(btn7.getText().toString())));
        btn8.setOnClickListener(v -> text1.setText(GetResultString(btn8.getText().toString())));
        btn9.setOnClickListener(v -> text1.setText(GetResultString(btn9.getText().toString())));
        btn0.setOnClickListener(v -> text1.setText(GetResultString(btn0.getText().toString())));
        cancel.setOnClickListener(v -> text1.setText(""));

    }
    protected String GetResultString(String str) {
        return text1.getText().toString() + str;//"Result: " + (str.equals("") ? "0" : str) + " ";
    }

}
