package com.example.cobalokanusa.repositories;

import android.content.Context;

import com.example.cobalokanusa.database.AppDatabase;
import com.example.cobalokanusa.database.entities.Quiz;

import java.util.List;

public class QuizRepository {

    private final AppDatabase database;

    public QuizRepository(Context context) {
        database = AppDatabase.getInstance(context);
    }

    public List<Quiz> getAllQuiz() {
        return database.quizDao().getAllQuiz();
    }

    public void insertQuiz(Quiz quiz) {
        database.quizDao().insert(quiz);
    }
}