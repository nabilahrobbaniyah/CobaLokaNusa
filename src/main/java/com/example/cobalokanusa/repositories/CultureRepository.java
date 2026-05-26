package com.example.cobalokanusa.repositories;

import android.content.Context;

import com.example.cobalokanusa.database.AppDatabase;
import com.example.cobalokanusa.database.entities.Culture;

import java.util.List;

public class CultureRepository {

    private final AppDatabase database;

    public CultureRepository(Context context) {
        database = AppDatabase.getInstance(context);
    }

    public void insertCulture(Culture culture) {
        database.cultureDao().insert(culture);
    }

    public List<Culture> getAllCulture() {
        return database.cultureDao().getAllCulture();
    }
}