package com.example.cobalokanusa.services;

import android.content.Context;

import com.example.cobalokanusa.database.entities.ForumPost;
import com.example.cobalokanusa.repositories.ForumRepository;

import java.util.List;

public class ForumService {

    private final ForumRepository repository;

    public ForumService(Context context) {
        repository = new ForumRepository(context);
    }

    public void createPost(ForumPost post) {
        repository.createPost(post);
    }

    public List<ForumPost> getForumPosts() {
        return repository.getAllPosts();
    }
}