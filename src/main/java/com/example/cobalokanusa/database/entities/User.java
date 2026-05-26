package com.example.cobalokanusa.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String username;
    public String email;
    public String passwordHash;
    public String role;
    public String createdAt;
}