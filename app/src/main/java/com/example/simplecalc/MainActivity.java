package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText valor1,valor2;
    Button buttonSoma, buttonDiv, buttonMult, buttonSub;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = (EditText) findViewById(R.id.valor1);
        valor2 = (EditText) findViewById(R.id.valor2);
        buttonSoma = (Button) findViewById(R.id.buttonSoma);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMult = (Button) findViewById(R.id.buttonMult);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        result = (TextView) findViewById(R.id.result);

        buttonSoma.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                double numero1 = Double.parseDouble(valor1.getText().toString());
                double numero2 = Double.parseDouble(valor2.getText().toString());
                double soma = numero1 + numero2;
                String soma2 = String.valueOf(soma);
                result.setText(soma2);
            }
        });

        buttonSub.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                double numero1 = Double.parseDouble(valor1.getText().toString());
                double numero2 = Double.parseDouble(valor2.getText().toString());
                double sub = numero1 - numero2;
                String sub2 = String.valueOf(sub);
                result.setText(sub2);
            }
        });

        buttonMult.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                double numero1 = Double.parseDouble(valor1.getText().toString());
                double numero2 = Double.parseDouble(valor2.getText().toString());
                double mult = numero1 * numero2;
                String mult2 = String.valueOf(mult);
                result.setText(mult2);
            }
        });

        buttonDiv.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                double numero1 = Double.parseDouble(valor1.getText().toString());
                double numero2 = Double.parseDouble(valor2.getText().toString());
                double div = numero1 / numero2;
                String div2 = String.valueOf(div);
                result.setText(div2);
            }
        });


    }
}