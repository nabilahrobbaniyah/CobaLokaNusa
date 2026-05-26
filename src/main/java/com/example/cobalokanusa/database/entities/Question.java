package com.example.cobalokanusa.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Question {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public int quizId;
    public String text;
    public String type;
    public int points;
}