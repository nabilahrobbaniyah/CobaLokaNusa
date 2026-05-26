package com.example.cobalokanusa.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class OfflineContent {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public int userId;
    public String contentId;
    public String downloadedAt;
}