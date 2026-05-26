package com.example.cobalokanusa.repositories;

import android.content.Context;

import com.example.cobalokanusa.database.AppDatabase;
import com.example.cobalokanusa.database.entities.User;

public class UserRepository {

    private final AppDatabase database;

    public UserRepository(Context context) {
        database = AppDatabase.getInstance(context);
    }

    public void register(User user) {
        database.userDao().insert(user);
    }

    public User login(String email, String password) {
        return database.userDao().login(email, password);
    }
}