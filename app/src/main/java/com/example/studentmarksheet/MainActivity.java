package com.example.studentmarksheet;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//public class StudentMarksheetActivity extends AppCompatActivity {

        final EditText editTextSubject1 = findViewById(R.id.editTextSubject1);
        final EditText editTextSubject2 = findViewById(R.id.editTextSubject2);
        Button buttonCalculateResult = findViewById(R.id.buttonCalculateResult);
        buttonCalculateResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int marks1 = Integer.parseInt(editTextSubject1.getText().toString());
                int marks2 = Integer.parseInt(editTextSubject2.getText().toString());
                int totalMarks = marks1 + marks2;
                String result = (totalMarks >= 60) ? "Pass" : "Fail";
                Bundle bundle = new Bundle();
                bundle.putString("result", result);
                Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });    }}
