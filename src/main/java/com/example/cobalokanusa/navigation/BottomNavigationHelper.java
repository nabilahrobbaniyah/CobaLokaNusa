package com.example.cobalokanusa.navigation;

import android.app.Activity;
import android.content.Intent;

import com.example.cobalokanusa.activities.MainActivity;
import com.example.cobalokanusa.activities.QuizActivity;

public class BottomNavigationHelper {

    public static void openMain(Activity activity) {
        activity.startActivity(
                new Intent(activity, MainActivity.class)
        );
    }

    public static void openQuiz(Activity activity) {
        activity.startActivity(
                new Intent(activity, QuizActivity.class)
        );
    }
}