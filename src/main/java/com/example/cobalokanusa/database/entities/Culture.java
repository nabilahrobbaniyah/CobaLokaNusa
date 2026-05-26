package com.example.cobalokanusa.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Culture {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String title;
    public String description;
    public String category;
    public String location;
    public String status;
    public int contributorId;
    public int validatorId;
    public String createdAt;
}