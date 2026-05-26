package com.example.cobalokanusa.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.cobalokanusa.R;

public class MainActivity extends AppCompatActivity {

    Button btnQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnQuiz = findViewById(R.id.btnQuiz);

        btnQuiz.setOnClickListener(v -> {
            startActivity(new Intent(this, QuizActivity.class));
        });
    }
}