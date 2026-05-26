package com.example.cobalokanusa.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Vocabulary {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public int cultureId;
    public String word;
    public String meaning;
    public String audioUrl;
}