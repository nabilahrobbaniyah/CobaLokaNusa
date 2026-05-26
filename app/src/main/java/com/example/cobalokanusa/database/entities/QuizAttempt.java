package com.example.cobalokanusa.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class QuizAttempt {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public int userId;
    public int quizId;
    public int score;
    public String createdAt;
}