package com.example.cobalokanusa.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.cobalokanusa.database.entities.Question;

import java.util.List;

@Dao
public interface QuestionDao {

    @Insert
    void insert(Question question);

    @Query("SELECT * FROM Question WHERE quizId = :quizId")
    List<Question> getQuestionsByQuiz(int quizId);
}