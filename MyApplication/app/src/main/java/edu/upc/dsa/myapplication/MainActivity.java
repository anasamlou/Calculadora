package edu.upc.dsa.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button coma;
    private Button equal;
    private Button plus;
    private Button division;
    private Button minus;
    private Button multiplication;
    private Button clear;
    private Button sinus;
    private Button cosinus;
    private Button tangent;
    private TextView operation;
    private TextView result;
    private final char signoMAS = '+';
    private final char signoMENOS = '-';
    private final char signoMULT = '*';
    private final char signoDIV = '/';
    private final char signoSIN = 'S';
    private final char signoCOS = 'C';
    private final char signoTAN = 'T';
    private double opVALUE = Double.NaN;
    private double resultVALUE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupLayout();
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation.setText(operation.getText().toString() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation.setText(operation.getText().toString() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation.setText(operation.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation.setText(operation.getText().toString() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation.setText(operation.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation.setText(operation.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation.setText(operation.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation.setText(operation.getText().toString() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation.setText(operation.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation.setText(operation.getText().toString() + "9");
            }
        });

    }
    private void setupLayout(){
        zero = (Button)findViewById(R.id.button0)
        one = (Button)findViewById(R.id.button1)
        two = (Button)findViewById(R.id.button2)
        three = (Button)findViewById(R.id.button3)
        four = (Button)findViewById(R.id.button4)
        five = (Button)findViewById(R.id.button5)
        six = (Button)findViewById(R.id.button6)
        seven = (Button)findViewById(R.id.button7)
        eight = (Button)findViewById(R.id.button8)
        nine = (Button)findViewById(R.id.button9)
        coma = (Button)findViewById(R.id.buttonCOMA)
        plus = (Button)findViewById(R.id.buttonPLUS)
        minus = (Button)findViewById(R.id.buttonMINUS)
        division = (Button)findViewById(R.id.buttonDIV)
        multiplication = (Button)findViewById(R.id.buttonMULT)
        sinus = (Button)findViewById(R.id.buttonSIN)
        cosinus = (Button)findViewById(R.id.buttonCOS)
        tangent = (Button)findViewById(R.id.buttonTAN)
        operation = (TextView) findViewById(R.id.textViewOPERATION)
        result = (TextView) findViewById(R.id.textViewRESULT)

    }
    private void compute(){
        if (!Double.isNaN(opVALUE))
            Double.parseDouble(operation.getText().toString());
    }
}
