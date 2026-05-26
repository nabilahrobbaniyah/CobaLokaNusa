package com.example.cobalokanusa.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Quiz {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public int level;
    public int createdBy;
}