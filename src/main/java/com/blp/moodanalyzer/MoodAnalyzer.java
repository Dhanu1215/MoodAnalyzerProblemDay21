package com.blp.moodanalyzer;

public class MoodAnalyzer {

    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyzer Program");
    }

    /**
     * Call method to test the mood
     */
    public static String analyzeMood(String message) {
        String mood = null;
        if (message.contains("sad")) {
            mood = "SAD";
        }
        return mood;
    }

    public static String analyzeMood1(String message) {
        String mood = null;
        if (message.contains("Any")) {
            mood = "HAPPY";
        }
        return mood;
    }
}
