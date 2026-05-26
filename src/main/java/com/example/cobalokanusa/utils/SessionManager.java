package com.example.cobalokanusa.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager {

    private static final String PREF_NAME = "culture_session";
    private static final String KEY_USER = "user_id";

    private final SharedPreferences preferences;

    public SessionManager(Context context) {
        preferences = context.getSharedPreferences(
                PREF_NAME,
                Context.MODE_PRIVATE
        );
    }

    public void saveUser(int userId) {
        preferences.edit().putInt(KEY_USER, userId).apply();
    }

    public int getUserId() {
        return preferences.getInt(KEY_USER, -1);
    }

    public void logout() {
        preferences.edit().clear().apply();
    }
}