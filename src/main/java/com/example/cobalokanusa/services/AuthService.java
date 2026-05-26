package com.example.cobalokanusa.services;

import android.content.Context;

import com.example.cobalokanusa.database.entities.User;
import com.example.cobalokanusa.repositories.UserRepository;

public class AuthService {

    private final UserRepository repository;

    public AuthService(Context context) {
        repository = new UserRepository(context);
    }

    public void register(User user) {
        repository.register(user);
    }

    public User login(String email, String password) {
        return repository.login(email, password);
    }
}