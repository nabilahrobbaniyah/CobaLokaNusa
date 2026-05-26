package com.example.cobalokanusa.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cobalokanusa.R;
import com.example.cobalokanusa.adapters.QuizAdapter;
import com.example.cobalokanusa.database.AppDatabase;
import com.example.cobalokanusa.database.entities.Quiz;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class QuizActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        recyclerView = findViewById(R.id.recyclerQuiz);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        loadQuizzes();
    }

    private void loadQuizzes() {
        executorService.execute(() -> {
            AppDatabase db = AppDatabase.getInstance(this);
            List<Quiz> quizzes = db.quizDao().getAllQuiz();

            if (quizzes.isEmpty()) {
                // Add some dummy data for emulator testing
                for (int i = 1; i <= 5; i++) {
                    Quiz dummy = new Quiz();
                    dummy.level = i;
                    db.quizDao().insert(dummy);
                }
                quizzes = db.quizDao().getAllQuiz();
            }

            List<Quiz> finalQuizzes = quizzes;
            runOnUiThread(() -> {
                QuizAdapter adapter = new QuizAdapter(finalQuizzes);
                recyclerView.setAdapter(adapter);
            });
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        executorService.shutdown();
    }
}