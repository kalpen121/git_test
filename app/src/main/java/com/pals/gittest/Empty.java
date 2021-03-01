package com.pals.gittest;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

public class Empty extends AppCompatActivity {

    private AppCompatEditText edt_num1;
    private AppCompatEditText edt_num2;
    private AppCompatButton cmd_sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);

        edt_num1 = findViewById(R.id.edt_number1);
        edt_num2 = findViewById(R.id.edt_number2);

        cmd_sum = findViewById(R.id.button);

        cmd_sum.setOnClickListener(view -> {
            Toast.makeText(Empty.this, Integer.parseInt(edt_num1.getText().toString())
                    + Integer.parseInt(edt_num2.getText().toString()), Toast.LENGTH_SHORT).show();
        });
    }
}