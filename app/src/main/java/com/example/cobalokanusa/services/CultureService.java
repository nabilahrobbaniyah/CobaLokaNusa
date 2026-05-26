package com.example.cobalokanusa.services;

import android.content.Context;

import com.example.cobalokanusa.database.entities.Culture;
import com.example.cobalokanusa.repositories.CultureRepository;

import java.util.List;

public class CultureService {

    private final CultureRepository repository;

    public CultureService(Context context) {
        repository = new CultureRepository(context);
    }

    public void createCulture(Culture culture) {
        repository.insertCulture(culture);
    }

    public List<Culture> getCultureList() {
        return repository.getAllCulture();
    }
}