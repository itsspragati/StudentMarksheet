package com.example.studentmarksheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView textViewResult = findViewById(R.id.textViewResult);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String result = bundle.getString("result");
            textViewResult.setText("Result: " + result);
            Class<?> nextActivityClass = (result.equals("Pass")) ? try_again.class :                  ResultActivity.class;
            Intent intent = new Intent(ResultActivity.this, nextActivityClass);
            intent.putExtra("previous_activity", ResultActivity.class);
            startActivity(intent);
        }
    }
}
