package com.example.cobalokanusa.database;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import android.content.Context;

import com.example.cobalokanusa.database.dao.*;
import com.example.cobalokanusa.database.entities.*;

@Database(entities = {
        User.class,
        Quiz.class,
        Question.class,
        Option.class,
        QuizAttempt.class,
        UserAnswer.class,
        Progress.class,
        OfflineContent.class,
        ForumPost.class,
        ForumComment.class,
        Achievement.class,
        UserAchievement.class,
        Culture.class,
        Vocabulary.class,
        Media.class,
        Validation.class
}, version = 1)

public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase instance;

    public abstract UserDao userDao();
    public abstract QuizDao quizDao();
    public abstract QuestionDao questionDao();
    public abstract CultureDao cultureDao();
    public abstract ForumDao forumDao();
    public abstract AchievementDao achievementDao();

    public static synchronized AppDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(
                    context.getApplicationContext(),
                    AppDatabase.class,
                    "culture_database"
            ).allowMainThreadQueries().build();
        }
        return instance;
    }
}