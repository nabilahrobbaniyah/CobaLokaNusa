package com.example.cobalokanusa.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class UserAnswer {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public int attemptId;
    public int questionId;
    public int optionId;
    public String answerText;
}