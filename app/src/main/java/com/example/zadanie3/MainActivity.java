package com.example.zadanie3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = (EditText)findViewById(R.id.editText);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 0;
                String strInt = String.valueOf(number);
                if(editText.getText().toString().equals("")){
                    editText.setText(strInt);
                }
                else {
                    String getEdit = editText.getText().toString();
                    getEdit = getEdit + strInt;
                    editText.setText(getEdit);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 1;
                String strInt = String.valueOf(number);
                if(editText.getText().toString().equals("")){
                    editText.setText(strInt);
                }
                else {
                    String getEdit = editText.getText().toString();
                    getEdit = getEdit + strInt;
                    editText.setText(getEdit);
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 2;
                String strInt = String.valueOf(number);
                if(editText.getText().toString().equals("")){
                    editText.setText(strInt);
                }
                else {
                    String getEdit = editText.getText().toString();
                    getEdit = getEdit + strInt;
                    editText.setText(getEdit);
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 3;
                String strInt = String.valueOf(number);
                if(editText.getText().toString().equals("")){
                    editText.setText(strInt);
                }
                else {
                    String getEdit = editText.getText().toString();
                    getEdit = getEdit + strInt;
                    editText.setText(getEdit);
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 4;
                String strInt = String.valueOf(number);
                if(editText.getText().toString().equals("")){
                    editText.setText(strInt);
                }
                else {
                    String getEdit = editText.getText().toString();
                    getEdit = getEdit + strInt;
                    editText.setText(getEdit);
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 5;
                String strInt = String.valueOf(number);
                if(editText.getText().toString().equals("")){
                    editText.setText(strInt);
                }
                else {
                    String getEdit = editText.getText().toString();
                    getEdit = getEdit + strInt;
                    editText.setText(getEdit);
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 6;
                String strInt = String.valueOf(number);
                if(editText.getText().toString().equals("")){
                    editText.setText(strInt);
                }
                else {
                    String getEdit = editText.getText().toString();
                    getEdit = getEdit + strInt;
                    editText.setText(getEdit);
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 7;
                String strInt = String.valueOf(number);
                if(editText.getText().toString().equals("")){
                    editText.setText(strInt);
                }
                else {
                    String getEdit = editText.getText().toString();
                    getEdit = getEdit + strInt;
                    editText.setText(getEdit);
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 8;
                String strInt = String.valueOf(number);
                if(editText.getText().toString().equals("")){
                    editText.setText(strInt);
                }
                else {
                    String getEdit = editText.getText().toString();
                    getEdit = getEdit + strInt;
                    editText.setText(getEdit);
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = 9;
                String strInt = String.valueOf(number);
                if(editText.getText().toString().equals("")){
                    editText.setText(strInt);
                }
                else {
                    String getEdit = editText.getText().toString();
                    getEdit = getEdit + strInt;
                    editText.setText(getEdit);
                }
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), editText.getText().toString(), Toast.LENGTH_SHORT).show();
                editText.getText().clear();
            }
        });
    }
}