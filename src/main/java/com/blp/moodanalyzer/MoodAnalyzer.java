package com.blp.moodanalyzer;

public class MoodAnalyzer {
    public static String message1;


    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message1) {
        MoodAnalyzer.message1 = message1;
    }

    /**
     * Call method to test the mood and handle exception
     */
    public static String analyzeMood() {

        MoodAnalyzer md = new MoodAnalyzer("");
        try {
            if (message1.length() == 0)
                throw new NullPointerException();
            if (message1.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
