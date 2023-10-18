package com.example.studentmarksheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class try_again extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_try_again);


        TextView textViewMessage = findViewById(R.id.textViewMessage);
        Button buttonTryAgain = findViewById(R.id.buttonTryAgain);
        Intent intent = getIntent();
        Class<?> previousActivityClass = (Class<?>) intent.getSerializableExtra("previous_activity");
        if (previousActivityClass == MainActivity.class) {
            textViewMessage.setText("Try Again");
        } else if (previousActivityClass == ResultActivity.class) {
            textViewMessage.setText("Congratulations!");
        }
        buttonTryAgain.setOnClickListener(new View.OnClickListener() {
            @Override            public void onClick(View view) {
                Intent tryAgainIntent = new Intent(try_again.this, MainActivity.class);
                startActivity(tryAgainIntent);
            }
        });    }
}
