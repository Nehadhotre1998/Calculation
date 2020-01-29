package com.example.calculation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText num1, num2;
    Button sum, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num);
        num2 = findViewById(R.id.num2);
        sum = findViewById(R.id.sum);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                addition(num1, num2);


//                String NUM1 = num1.getText().toString();
//                String NUM2 = num2.getText().toString();
//
//                if (NUM1.equals("") && NUM2.equals("")) {
//                    Toast.makeText(getApplicationContext(), "Enter value", Toast.LENGTH_LONG).show();
//                } else {
//                    int i = Integer.parseInt(NUM1);
//                    int j = Integer.parseInt(NUM2);
//                    int total = i + j;
//
//                    Toast.makeText(getApplicationContext(), "Sum is " + String.valueOf(total), Toast.LENGTH_LONG).show();
//                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NUM1 = num1.getText().toString();
                String NUM2 = num2.getText().toString();

                if (NUM1.equals("") && NUM2.equals("")) {
                    Toast.makeText(getApplicationContext(), "Enter value", Toast.LENGTH_LONG).show();
                } else {
                    int i = Integer.parseInt(NUM1);
                    int j = Integer.parseInt(NUM2);
                    int total = i - j;

                    Toast.makeText(getApplicationContext(), "Sub is " + String.valueOf(total), Toast.LENGTH_LONG).show();
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NUM1 = num1.getText().toString();
                String NUM2 = num2.getText().toString();

                if (NUM1.equals("") && NUM2.equals("")) {
                    Toast.makeText(getApplicationContext(), "Enter value", Toast.LENGTH_LONG).show();
                } else {
                    int i = Integer.parseInt(NUM1);
                    int j = Integer.parseInt(NUM2);
                    int total = i * j;

                    Toast.makeText(getApplicationContext(), "Mul is " + String.valueOf(total), Toast.LENGTH_LONG).show();
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NUM1 = num1.getText().toString();
                String NUM2 = num2.getText().toString();

                if (NUM1.equals("") && NUM2.equals("")) {
                    Toast.makeText(getApplicationContext(), "Enter value", Toast.LENGTH_LONG).show();
                } else {
                    int i = Integer.parseInt(NUM1);
                    int j = Integer.parseInt(NUM2);
                    int total = i / j;

                    Toast.makeText(getApplicationContext(), "Div is " + String.valueOf(total), Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    private void addition(EditText a, EditText b) {
        String NUM1 = a.getText().toString();
        String NUM2 = b.getText().toString();

        int i = Integer.parseInt(NUM1);
        int j = Integer.parseInt(NUM2);
        int total = i + j;

        Toast.makeText(getApplicationContext(), "Total is " + String.valueOf(total), Toast.LENGTH_LONG).show();
    }
}
