package com.example.cobalokanusa.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Option {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public int questionId;
    public String text;
    public boolean isCorrect;
}