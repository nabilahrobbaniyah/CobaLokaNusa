package com.example.cobalokanusa.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;

import com.example.cobalokanusa.database.entities.Achievement;

@Dao
public interface AchievementDao {

    @Insert
    void insert(Achievement achievement);
}