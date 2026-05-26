package com.example.cobalokanusa.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.cobalokanusa.database.entities.Quiz;

import java.util.List;

@Dao
public interface QuizDao {

    @Insert
    void insert(Quiz quiz);

    @Query("SELECT * FROM Quiz")
    List<Quiz> getAllQuiz();
}