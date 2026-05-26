package com.example.cobalokanusa.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ForumComment {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public int postId;
    public int userId;
    public String content;
    public String createdAt;
}