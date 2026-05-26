package com.example.cobalokanusa.repositories;

import android.content.Context;

import com.example.cobalokanusa.database.AppDatabase;
import com.example.cobalokanusa.database.entities.ForumPost;

import java.util.List;

public class ForumRepository {

    private final AppDatabase database;

    public ForumRepository(Context context) {
        database = AppDatabase.getInstance(context);
    }

    public void createPost(ForumPost post) {
        database.forumDao().insert(post);
    }

    public List<ForumPost> getAllPosts() {
        return database.forumDao().getAllPosts();
    }
}