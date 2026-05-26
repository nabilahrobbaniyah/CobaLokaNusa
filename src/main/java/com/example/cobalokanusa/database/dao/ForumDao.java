package com.example.cobalokanusa.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.cobalokanusa.database.entities.ForumPost;

import java.util.List;

@Dao
public interface ForumDao {

    @Insert
    void insert(ForumPost post);

    @Query("SELECT * FROM ForumPost")
    List<ForumPost> getAllPosts();
}