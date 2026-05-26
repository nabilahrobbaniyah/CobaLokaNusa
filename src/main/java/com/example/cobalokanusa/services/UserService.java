package com.example.cobalokanusa.services;

import android.content.Context;

import com.example.cobalokanusa.database.entities.User;
import com.example.cobalokanusa.repositories.UserRepository;

public class UserService {

    private final UserRepository repository;

    public UserService(Context context) {
        repository = new UserRepository(context);
    }

    public User login(String email, String password) {
        return repository.login(email, password);
    }

    public void register(User user) {
        repository.register(user);
    }

    public boolean isAdmin(User user) {
        return user.role.equals("ADMIN");
    }
}