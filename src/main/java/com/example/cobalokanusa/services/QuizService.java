package com.example.cobalokanusa.services;

import android.content.Context;

import com.example.cobalokanusa.database.entities.Quiz;
import com.example.cobalokanusa.repositories.QuizRepository;

import java.util.List;

public class QuizService {

    private final QuizRepository repository;

    public QuizService(Context context) {
        repository = new QuizRepository(context);
    }

    public List<Quiz> getQuizList() {
        return repository.getAllQuiz();
    }

    public int calculateScore(int correctAnswer, int totalQuestion) {
        return (correctAnswer * 100) / totalQuestion;
    }
}