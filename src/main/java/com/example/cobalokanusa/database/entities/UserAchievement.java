package com.example.cobalokanusa.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class UserAchievement {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public int userId;
    public int achievementId;
    public String achievedAt;
}