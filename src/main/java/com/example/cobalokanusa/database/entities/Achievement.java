package com.example.cobalokanusa.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Achievement {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String name;
    public String description;
}