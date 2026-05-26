package com.example.cobalokanusa.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.cobalokanusa.database.entities.Culture;

import java.util.List;

@Dao
public interface CultureDao {

    @Insert
    void insert(Culture culture);

    @Query("SELECT * FROM Culture")
    List<Culture> getAllCulture();
}