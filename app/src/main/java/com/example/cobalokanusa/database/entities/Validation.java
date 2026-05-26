package com.example.cobalokanusa.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Validation {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public int cultureId;
    public int validatorId;
    public String status;
    public String note;
    public String createdAt;
}