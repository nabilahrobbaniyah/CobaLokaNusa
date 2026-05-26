package com.example.cobalokanusa.services;

public class ProgressService {

    public int calculateLevel(int totalPoints) {

        if (totalPoints >= 1000) {
            return 10;
        } else if (totalPoints >= 500) {
            return 5;
        }

        return 1;
    }

    public int updateProgress(int currentPoint, int earnedPoint) {
        return currentPoint + earnedPoint;
    }
}