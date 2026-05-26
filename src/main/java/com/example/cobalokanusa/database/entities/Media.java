package com.example.cobalokanusa.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Media {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public int cultureId;
    public String type;
    public String url;
}