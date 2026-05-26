package com.example.cobalokanusa.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ForumPost {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public int userId;
    public String title;
    public String content;
    public String createdAt;
}