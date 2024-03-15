package com.example.tabora1stapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView name;
    EditText myName;
    TextView myDisplay;
    Button myButton;
    Button myClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView) findViewById(R.id.textname);
        myName = (EditText) findViewById(R.id.myname);
        myDisplay = (TextView) findViewById(R.id.txtdisplay);
        myButton = (Button) findViewById(R.id.txtbutton);
        myClear = (Button) findViewById(R.id.btnclear);

        //myDisplay.setText(Hello Astin);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myValue = myName.getText().toString();
                myDisplay.setText("Hello "+ myValue +"!");
            }
        });
        myClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDisplay.setText("Hello!");
            }
        });
    }


}