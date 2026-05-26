package com.example.cobalokanusa.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Progress {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public int userId;
    public int totalPoints;
    public int level;
}